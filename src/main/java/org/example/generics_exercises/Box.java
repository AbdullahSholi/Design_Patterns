package org.example.generics_exercises;

public class Box<T> {

    private T value;

    void setT(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }

    <E> void printArray(E[] array){
        for( E element : array ){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.setT(20);
        System.out.println(b.getValue());
    }
}

class Pair1<K, U>{
    private K name;
    private U age;

    public K getName() {
        return name;
    }

    public Pair1(K name, U age) {
        this.name = name;
        this.age = age;
    }

    public void setName(K name) {
        this.name = name;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }

    <T extends Comparable<T>> T compare ( T first, T second ){
        return (first.compareTo(second) >= 0) ? first : second;
    }

    public static void main(String[] args) {
        Pair1<String, Integer> nameAgePair = new Pair1<>("Alice", 30);
        System.out.println("Name: " + nameAgePair.getName());
        System.out.println("Age: " + nameAgePair.getAge());

        // Changing the values
        nameAgePair.setName("Bob");
        nameAgePair.setAge(25);
        System.out.println("Updated Pair: " + nameAgePair);
    }
}

interface Repository<T>{
    void save(T item);
    void delete(T item);
    T find(int id);
}

class UserRepository implements Repository<String>{

    @Override
    public void save(String item) {
        System.out.println("save");
    }

    @Override
    public void delete(String item) {
        System.out.println("delete");
    }

    @Override
    public String find(int id) {
        return String.valueOf(id);
    }
}

class Builder<T>{

}


