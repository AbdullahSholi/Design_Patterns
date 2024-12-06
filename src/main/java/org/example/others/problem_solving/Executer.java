package org.example.others.problem_solving;

import java.util.*;

public class Executer {

    public static void main(String[] args) {


        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        Arrays.sort(strs);
        System.out.println(strs);

        for( int i=0; i<strs.length; i++ ){
            for( int j=strs.length-1; j>=0; j-- ){
                if( canConstruct(strs[i], strs[j]) && i!=j){

                }
            }
        }

        for( int i=0; i<strs.length; i++ ){
            System.out.println(strs[i]);
        }


    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();

        Arrays.sort(ransomNoteChars);
        Arrays.sort(magazineChars);

        int i = 0, j = 0;

        while (i < ransomNoteChars.length && j < magazineChars.length) {
            if (ransomNoteChars[i] == magazineChars[j]) {
                i++; // Move to the next char in ransomNote
            }
            j++; // Always move to the next char in magazine
        }

        return i == ransomNoteChars.length; // Check if all chars in ransomNote were matched
    }

}
