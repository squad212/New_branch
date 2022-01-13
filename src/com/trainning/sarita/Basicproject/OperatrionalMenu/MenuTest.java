package com.trainning.sarita.Basicproject.OperatrionalMenu;

import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.1");
        int number1 = sc.nextInt();
        System.out.println("Enter no.2");
        int number2 = sc.nextInt();

        System.out.println("Choices Available are:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.println("Enter choice:");
        int choice = sc.nextInt();

        System.out.println("Your choices are");
        System.out.println("No.1:  " +number1);
        System.out.println("No.2:  " + number2);
        System.out.println("choice:  " +choice);
        menu.option(number1,number2,choice);


    }
}
