package com.trainning.sarita.Basicproject.MotorBike;

public class BikeTest {
    public static void main(String[] args) {
        Bike ducati = new Bike();
        Bike honda = new Bike();

        ducati.start();
        honda.start();
        ducati.setSpeed(100);
        System.out.println( ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        ducati.setSpeed(20);
        honda.setSpeed(0);
        System.out.println("Hello from the other side");


    }
}
