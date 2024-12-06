package org.example.others.generics_exercises;

import java.util.List;

public class NumericBox<T extends Number> {
    private T number;

    public NumericBox(T number){
        this.number = number;
    }

    public double square(){
        return number.doubleValue() * number.doubleValue();
    }

    // Unbounded Wildcard Example
    public void test(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    // Upper - bounded Wildcard Example
    public double sumList( List<? extends Number> list ){
        double sum = 0.0;
        for( Number number : list )
            sum += number.doubleValue();
        return sum;
    }

    public static void main( String[] args ){
        // This not acceptable
        // NumericBox<String> nb = new NumericBox<String>();
        NumericBox<Double> nb = new NumericBox<Double>(10.0);
        System.out.println(nb.square());
    }
}
