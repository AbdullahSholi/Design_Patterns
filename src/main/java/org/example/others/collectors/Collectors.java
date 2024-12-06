package org.example.others.collectors;

import java.util.*;

public class Collectors {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));


        // Method 1 --> Collector< T, ?, List<T>toList()>
            // Transform the input elements into a new List and return a Collector
            // T --> The type of input elements
        List<String> specificTemperatureRange = cities
                .stream()
                .filter(city -> city.getTemperature()>10)
                .map(City::getName)
                .toList();
        specificTemperatureRange.forEach(city -> System.out.println(city));
        System.out.println();

        ////
        // Method 2 --> Collector<T, ?, Set<T> toSet()>
            // Transforms the input elements into a new Set and returns a Collector.
            // This method will return Set instance and it doesn’t contain any duplicates.
        Set<String> specificTemperatureRangeWithSets = cities
                .stream()
                .filter(city -> city.getTemperature()>10)
                .map(City::getName)
                .collect(java.util.stream.Collectors.toSet());
        specificTemperatureRangeWithSets.forEach(city -> System.out.println(city));
        System.out.println();

        ////
        // Method 3 --> toCollection(Supplier<C> collectionFactory)
            // Transform the input elements into a new Collection,
            // and returns a Collector. If we observe toList() and toSet() methods
            // discussed above, We don't have control over their implementations.
            // So with toCollection() we can achieve custom implementation Where C is the
            // type of the resulting collection and T is the type of the input elements

        Stack<String> custom = cities
                .stream()
                .map(City::getName)
                .collect(java.util.stream.Collectors.toCollection(Stack::new));

        System.out.println(custom.peek());
            // Similarly, we can use all other implementation classes such as ArrayList, HashSet, TreeSet, etc.

        ////
        // Method 4 --> Collector<T, ?, Map<K,U>>toMap(Function keyMapper, Function valueMapper)
            // Transforms the elements into a Map whose keys and values are the results
            // of applying the passed mapper functions to the input elements and returns a Collector
            // toMap() is used to collect input of elements and convert it into Map instance.
            // toMap() methods ask for following arguments
                // K - key function
                // U - Value Function
                // BinaryOperator(Optional)
                // Supplier(Optional)
        Map<String, Double> pairs = cities
                .stream()
                .collect(java.util.stream.Collectors.toMap(
                        City::getName,
                        City::getTemperature,
                        (existingValue, newValue)-> existingValue
                        //This field is called BinaryOperator for handle Key Collision
                ));
        for(Map.Entry<String, Double> e : pairs.entrySet()){
            System.out.println("Key: "+e.getKey()+", Value: "+e.getValue());
        }

        ////
        // Method 5 --> Method Collector collectingAndThen( Collector downstream, Function finisher )
        // This method allows us to perform another operation on the result
        // after collecting the input element of collection.
        System.out.println();
        int uniqueCount = cities.stream()
                .collect(java.util.stream.Collectors.collectingAndThen(
                        java.util.stream.Collectors.toSet(),
                        Set::size
                ));

        System.out.println("Number of unique items: " + uniqueCount);
        System.out.println();

        ////
        // Method 6 -->  Collector counting(): It counts the number of input elements of type T and returns a Collector.
        // This method is used in a case where we want to group and count the number of times each city is present in the collection of elements.

        Long numberOfCities = cities
                .stream()
                .collect(java.util.stream.Collectors.counting());
        System.out.println(numberOfCities);
        System.out.println();

        ////
        // Method 7 --> Collector <T, ?, Map<K, List>> groupingBy(Function classifier)
        // Performs group by operation on input elements of type T,
        // The grouping of elements is done as per the passed classifier function
        // and returns the Collector with result in a Map.

        // Method 8 -->  Collector <T, ?, Map> groupingBy(Function classifier, Collector downstream)
        // Method 9 -->  Collector groupingBy(Function classifier, Supplier mapFactory, Collector downstream)

        ////
        // Method 10 --> Collector joining()
        // Concatenates the input elements into a String and returns a Collector

        // Method 11 --> Collector joining(CharSequence delimiter)
        // Concatenates the input elements, separated by the specified delimiter, and returns a Collector.

        // Method 12 --> Collector joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        // Concatenates the input elements, separated by the specified delimiter, as per the specified prefix and suffix, and returns a Collector.
        // Example Output: Prefix:New Delhi Mexico New York Dubai London Kolkata Sydney Mexico Dubai:Suffix

        ////
        // Method 13 --> Collector mapping(Function mapper, Collector downstream)
        // Transforms a Collector of the input elements of type U to one of type T
        // by applying a mapping function to every input element before the transformation

        ////
        // Method 14 -->  Collector<T, ?, Map<Boolean, List>> partitioningBy(Predicate predicate)
        //  Partitions the input elements as per the passed Predicate,
        //  and transforms them into a Map and returns the Collector.
        Map<Boolean ,List<City>> partitionBySpecificTemperature = cities
                .stream()
                .collect(java.util.stream.Collectors.partitioningBy(
                        city->city.getTemperature() > 15
                ));
        for(Map.Entry<Boolean, List<City>> e : partitionBySpecificTemperature.entrySet()){
            System.out.println("Key: "+e.getKey());
            for (City c : e.getValue()){
                System.out.println("    Value: "+c);
            }
        }
        System.out.println();

        ////
        // Method 15 -->  Collector partitioningBy(Predicate predicate, Collector downstream)
        // Partitions the input elements as per the passed Predicate, and collects the values of each partition as per another Collector, and transforms them into a Map whose values are the results of the downstream reduction and then return Collector.

        ////
        // Method 16 -->  Collector averagingDouble(ToDoubleFunction mapper)
        // Method 17 -->  Collector averagingInt(ToIntFunction mapper)
        // Method 18 -->  Collector averagingLong(ToLongFunction mapper)

        ////
        // Method 19 --> Collector reducing(BinaryOperator op):
        // Performs a reduction of its input elements as per passed BinaryOperator and returns a Collector.
        // Use Case: A common use case for this method is aggregating values, such as summing a list of numbers or concatenating strings.
        // numbers.stream().collect(Collectors.reducing((a, b) -> a + b));
        // 0+2=2, 2+3=5, 5+6=11

        // Method 20 --> Collector reducing(T identity, BinaryOperator op):
        // Performs a reduction of its input elements as per passed BinaryOperator and as per the passed identity and returns Collector.
        // numbers.stream().collect(Collectors.reducing(10,(a, b) -> a + b));
        // 10+2=12, 12+3=15, 15+6=21

        // Method 21 --> Collector<T, ?, Optional<T>> maxBy(Comparator comparator)
        // Optional<String> longestWord = words.stream().collect(Collectors.maxBy(Comparator.comparing(String::length)));

        // Method 22 --> Collector<T, ?, Optional<T>> minBy(Comparator comparator)
        // Optional<String> shortestWord = words.stream().collect(Collectors.minBy(Comparator.comparing(String::length)));


    }
}


class City {

    // Initializing the properties
    // of the city class
    private String name;
    private double temperature;

    // Parameterized constructor to
    // initialize the city class
    public City(String name, double temperature)
    {
        this.name = name;
        this.temperature = temperature;
    }

    // Getters to get the name and
    // temperature
    public String getName()
    {
        return name;
    }

    public Double getTemperature()
    {
        return temperature;
    }

    // Overriding the toString method
    // to return the name and temperature
    @Override
    public String toString()
    {
        return name + " --> " + temperature;
    }
}
