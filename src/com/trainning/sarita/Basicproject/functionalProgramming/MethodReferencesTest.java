package com.trainning.sarita.basicproject.functionalProgramming;

import java.util.List;

public class MethodReferencesTest {
    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                //. forEach(s -> System.out.println(s));
                // alternative method with ::
                . forEach(System.out::println);
    }
}
