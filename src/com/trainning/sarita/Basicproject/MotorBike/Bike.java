package com.trainning.sarita.Basicproject.MotorBike;

public class Bike {
    //state can be the speed of the bike

    /*
    ( Declaration of member variable {private = access modifier, int = dataType,
     speed= member variable or variable name)

     */
    private static  int speed;


    Bike(){
        this(5);// create constructor for the something new.

    }

    Bike(int speed) {
        this.speed = speed;// constructor no need of return type and name of method.
    }

    // can be generate by clicking on code and getter and setter.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }
    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch); // to make the validation from the setter.
    }
    //behaviour
    void start(){
        System.out.println("Bike started");

    }
}
