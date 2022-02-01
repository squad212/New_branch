package com.trainning.sarita.basicproject.setInterface;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<Character> character = List.of('A','Z','A','B','S','M');

        //unique-Set
            // Tree- order
            // Hash- no matlab
            // LinkedHash- insert set


        // in keep in ascending order and eliminate the duplicate
        Set<Character> treeSet = new TreeSet<>(character);
        System.out.println("Treeset  "  +treeSet);

        // print as we insert the input and remove duplicate
        Set<Character> linkedHashSet = new LinkedHashSet<>(character);
        System.out.println("linkedHashSet  "  +linkedHashSet);

        //If we dont care about order or insert order
        Set<Character> hashSet = new HashSet<>(character);
        System.out.println("hashSet  "  +hashSet);

    }
}
