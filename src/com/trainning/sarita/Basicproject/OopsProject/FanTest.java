package com.trainning.sarita.Basicproject.OopsProject;

public class FanTest {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacture 1", 0.596,"green");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);



    }
}
