package org.example.others.generics;

public class BoundedTypeParameters {
    public static <N extends Number> N max (N x, N y){
        if(x.intValue() > y.intValue())
            return x;
        else
            return y;
    }

    public static <N extends Number> N max (N x, N y, N z){
         return max(max(x, y), z);
    }

    public static void main( String[] args ){
        System.out.println(max(1,2));
        System.out.println(max(1,2,5));
    }
}
