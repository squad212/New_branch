package com.trainning.sarita.basicproject.abstractExample;

public class RecipeTest{
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        recipe.execute();

        Recipe1withMicrowave recipe1withMicrowave = new Recipe1withMicrowave();
        recipe.execute();
    }
        }
