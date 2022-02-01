package com.trainning.sarita.basicproject.javaInterface;

public class GameTest {
    public static void main(String[] args) {
        //GamingConsole helps to easy to switch and eg of polymorphism.
        GamingConsole[] games = {new MarioGame(), new ChessGame()};
        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();
        }
    }
}
