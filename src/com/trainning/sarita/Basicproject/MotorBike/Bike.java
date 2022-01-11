package com.trainning.sarita.Basicproject.MotorBike;

public class Bike {
    //state can be the speed of the bike
    private int speed;
    // can be generate by clicking on code and getter and setter.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
     this.speed = speed;
    }

    //behaviour
    void start(){
        System.out.println("Bike started");

    }
}
