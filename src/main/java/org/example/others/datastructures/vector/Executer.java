package org.example.others.datastructures.vector;

import java.util.Iterator;
import java.util.Vector;
// Vector is Data Structure
// used to create modern arrays
// provide list of methods for: add, remove, manipulate more than 1 element at the same time
// variable size ( Resizeable Array )
// access elements via index

public class Executer {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(5, 5);
        vector.add("Element1");
        vector.add(1, "Element2");
        vector.add(2, "element2");
        vector.set(2, "Element3");
        vector.remove("Element3");
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        System.out.println(vector.get(0));
        System.out.println(vector);

        for( String item : vector ){
            System.out.println(item);
        }

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
        }

        boolean contains = vector.contains("Element2");
        System.out.println(contains);

        System.out.println(vector.indexOf("Element2"));

        // convert vector to array
        String[] arrOfStrings = vector.toArray(new String[0]);

        Vector<String> anotherVector = new Vector<>();
        anotherVector.add("Element3");
        anotherVector.add("Element4");
        vector.addAll(anotherVector);

        System.out.println(vector.subList(1,3));
        vector.trimToSize();
        System.out.println(vector.capacity());


    }



}
