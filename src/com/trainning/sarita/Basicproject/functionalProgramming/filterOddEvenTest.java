package com.trainning.sarita.basicproject.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;


public class filterOddEvenTest {
    public static void main(String[] args) {
        System.out.println("The even number is: ");
        List.of(23,43,34,45,2,66,99).stream()
                .filter(n -> n%2 ==0).forEach(e -> System.out.println(e));
        System.out.println("The odd number is: ");
        List.of(23,43,34,45).stream()
                .filter(n -> n%2 ==1).forEach(e -> System.out.println(e));

    }
}
