package org.example.others.generics;

public class GenericsPractice {

    public static <E> void printArray(E[] array){
        for( E element : array ){
            System.out.println(element+" ");
        }
        System.out.println();
    }

    public static void main( String[] args ){
        Integer   arr1[] = {1, 2, 3, 4, 5};
        Long      arr2[] = {1l, 2l, 3l, 4l, 5l};
        Float     arr3[] = {1f, 2f, 3f, 4f, 5f};
        Double    arr4[] = {1d, 2d, 3d, 4d, 5d};
        Character arr5[] = {'a', 'b', 'c', 'd', 'e'};
        String    arr6[] = {"Generics ", "are ", "easy ", "to ", "understand"};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);

    }
}


