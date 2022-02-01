package com.trainning.sarita.basicproject.interfaceandAbstract;


    abstract class Animal {
        abstract void bark();
    }
    class Dog extends Animal{
        public void bark(){
            System.out.println("bow bow");
        }
    }

    class Cat extends Animal{
        public void bark(){
            System.out.println("meow meow");
        }
    }
public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()}; // same code different behavior so it is polymorphism
        for (Animal animal:animals){
            animal.bark();
        }


    }
}


