package org.example.others.generics_exercises;

public class MultipleBoundaryType <T extends Number & Comparable<T>> {
    private T value;

    public MultipleBoundaryType(T value){
        this.value = value;
    }

    public int compare( T other ){
        return value.compareTo(other);
    }
}
