package org.example.others.generics;

class Box<T> {
    private T x;

    public void setX(T x) {
        this.x = x;
    }

    public T getX(){
        return x;
    }


}

public class GenericClass{
    public static void main(String[] args){
        Box<int[]> b = new Box();

        int[] arr = {1, 2, 3, 4, 5};

        b.setX(arr);
        for ( int element : b.getX() ){
            System.out.println(element);
        }


    }
}
