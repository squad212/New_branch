package com.trainning.sarita.basicproject.javaInterface;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Jump");

    }

    @Override
    public void down() {
        System.out.println("Sit");

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Move right");

    }
}
