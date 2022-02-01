package com.trainning.sarita.basicproject.streamIntermediate;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberTest {
    public static void main(String[] args) {
        IntStream.range (1,11).forEach(p->System.out.println(p));
        IntStream.range (1,11).map(e -> e * e).forEach(p->System.out.println(p));
        IntStream.range(1,11).reduce(0, (n1,n2) -> n1+n2);




        // List<Integer> numbers = List.of(4,6,8,13,3,15);
        //for (int p = 1; p <= 10; p++) {
            //System.out.println(p*p);
        }
    }

