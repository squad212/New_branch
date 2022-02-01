package com.trainning.sarita.basicproject.abstractExample;

public class Recipe1 extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw material");
        System.out.println("cope the veggie");

    }

    @Override
    void doTheDish() {
        System.out.println("Clean the dishes");
        System.out.println("Sanitize the dishes");
        System.out.println("Dry the dishes");

    }

    @Override
    void cleanup() {
        System.out.println("clean and mope the kitchen");
        System.out.println("Organize the stuff");

    }
}
