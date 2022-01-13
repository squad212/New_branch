package com.trainning.sarita.Basicproject.MotorBike;

public class BikeTest {
    public static void main(String[] args) {
        Bike ducati = new Bike(100);
        Bike honda = new Bike(80);
        Bike something = new Bike();
        System.out.println( ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(something.getSpeed());
        ducati.start();
        honda.start();



        //ducati.setSpeed(100);
        //honda.setSpeed(80);
        /*
        this help to elmilnate the code that will have duplication .
         if we can increase the speed of both bike then just create the method
         */
        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);
        System.out.println( ducati.getSpeed());
        System.out.println(honda.getSpeed());


        ducati.decreaseSpeed(500);
        honda.decreaseSpeed(10);
        System.out.println( ducati.getSpeed());
        System.out.println(honda.getSpeed());





    }
}
