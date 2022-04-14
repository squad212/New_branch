package com.trainning.sarita.basicproject.ifStatement;

import java.util.Scanner;

public class IfSatatementTest {

    public static void main(String[] args) {
        IfSatatement Iso = new IfSatatement();
        Scanner sc= new Scanner(System.in); // it helps any integer input.
        System.out.println("enter your number: ");
        int i = sc.nextInt();// It helps to take value and read as integer
        System.out.println("The number is:" +i);
        Iso.ifStatement(i);

    }
}