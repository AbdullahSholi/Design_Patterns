package org.example.others.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapCreation {
    public static void main(String[] args) {
        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2};
        ArrayList<Integer> aa = new ArrayList<>();
        for( int i=0; i<a.length; i++ ){
            aa.add(i);
        }

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<aa.size(); i++){
            h.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
        }
        System.out.println(h);
    }
}
