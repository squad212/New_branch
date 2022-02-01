package com.trainning.sarita.basicproject.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        String str = "This is an awsome place."+ " This place is my fav place.";
        Map<Character, Integer> occurances = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character:characters) {
            //Get the character
            Integer integer = occurances.get(character);
            if (integer == null) {
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
                //if it is there, we increment the count
                //if it is not there, initialize to 1
            }
        }
        System.out.println(occurances);

        // for string
        Map<String, Integer> stringoccurances = new HashMap<>();
        String[] words = str.split(" ");
        for(String word:words) {
            //Get the character
            Integer integer = stringoccurances.get(word);
            if (integer == null) {
                stringoccurances.put(word, 1);
            } else {
                stringoccurances.put(word, integer + 1);
                //if it is there, we increment the count
                //if it is not there, initialize to 1
            }
        }
        System.out.println(stringoccurances);

    }
}
