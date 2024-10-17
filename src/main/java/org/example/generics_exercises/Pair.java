package org.example.generics_exercises;

public interface Pair <K, V>{
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V>{
    private K key;
    private V value;

    public OrderedPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public static void main( String[] args ){
        Pair<Integer, Integer> p1 = new OrderedPair<>(1,1);
        Pair<String, Integer> p2 = new OrderedPair<>("id", 1);
        System.out.println(p1.getKey() + " : " + p1.getValue());
        System.out.println(p2.getKey() + " : " + p2.getValue());
    }
}
