package org.example.others.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercises {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        list.stream().forEach(System.out::println);

        ////

        List<String> list1 = new ArrayList<>(
                Arrays.asList("Abdullah", "Ali", "Omar")
        );
        list1.stream().filter(str -> str.startsWith("A")).forEach(System.out::print);

        ////

        System.out.println();
        List<String> list2 = new ArrayList<>(
                Arrays.asList("Abdullah", "Ali", "Omar")
        );
        StreamsExercises streamsExercises = new StreamsExercises();
        list2.stream().map(streamsExercises::getOverFour).forEach(System.out::println);

        ////
        System.out.println();
        List<Integer> list3 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );
        list3.stream().map(value -> Math.pow(value, 2)).forEach(System.out::println);

        ////

        System.out.println();
        List<Integer> list4 = new ArrayList<>(
                Arrays.asList(20, 10, 15, 13, 17)
        );

        list4.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        ////

        System.out.println();
        List<String> list5 = new ArrayList<>(
                Arrays.asList("Abdullah", "Omar", "Ali", "Rashid")
        );

        list5.stream().sorted().forEach(System.out::println);

        ////

        System.out.println();
        List<Integer> list6 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );

        System.out.println(list6.stream().reduce(0, Integer::sum));

        ////

        System.out.println();
        List<Integer> list7 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );

        System.out.println(list7.stream().reduce(Integer::max).get());

        ////

        System.out.println();
        System.out.println();
        List<String> list8 = new ArrayList<>(
                Arrays.asList("Jehad", "Rashid", "Jony", "Ali")
        );
        List<String> list9;
        list9 = list8.stream().filter(str-> str.startsWith("J")).toList();
        System.out.println(list9);

        ////

        System.out.println();
        List<Person> list10 = new ArrayList<>(
                Arrays.asList(new Person("Abdullah", 20), new Person("Ali", 16))
        );
        list10.stream().filter(person -> person.getAge() < 18).forEach(person -> System.out.println(person.getName()+ ", "+person.getAge()));

        ////

        List<List<Integer>> list11 = new ArrayList<>(
                Arrays.asList( Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9, 10) )
        );
        list11.stream().flatMap(List::stream).forEach(System.out::print);

        ////


    }

    public String getOverFour( String str ){
        return str.length() > 4 ? str : "";
    }





}

class Person {
    private final String name;
    private final int age;

    Person( String name, int age ){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
