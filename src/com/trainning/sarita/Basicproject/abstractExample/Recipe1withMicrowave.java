package com.trainning.sarita.basicproject.abstractExample;

public class Recipe1withMicrowave extends AbstractRecipe {
    @Override
    void getReady() {
        System.out.println("Get the raw material");
        System.out.println("Switch on the microwave");

    }

    @Override
    void doTheDish() {
        System.out.println("Clean the dishes");
        System.out.println("Sanitize the dishes");
        System.out.println("Dry the dishes");
        System.out.println("Clean the Microwave dishes");

    }

    @Override
    void cleanup() {
        System.out.println("clean and mope the kitchen");
        System.out.println("Organize the stuff");
        System.out.println("turn off the microwave");

    }
}
