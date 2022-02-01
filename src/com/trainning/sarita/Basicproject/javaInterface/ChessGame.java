package com.trainning.sarita.basicproject.javaInterface;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Move forward");

    }

    @Override
    public void down() {
        System.out.println("Move backward");

    }

    @Override
    public void left() {
        System.out.println("move left");

    }

    @Override
    public void right() {
        System.out.println("Move right");

    }
}
