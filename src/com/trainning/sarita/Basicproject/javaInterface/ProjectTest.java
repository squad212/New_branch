package com.trainning.sarita.basicproject.javaInterface;

public class ProjectTest {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(20,30));

        // after we change dummy algorithm to real algorithm
        // it take multiplication instead of add)

        ComplexAlgorithm algorithm1 = new DummyAlgorithm();
        System.out.println(algorithm1.complexAlgorithm(20,30));

    }
}
