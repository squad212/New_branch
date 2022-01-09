package com.trainning.sarita.Basicproject.Sum;

import java.util.Scanner;
public class SumCalculatorTest {
    public static void main(String[] args) {
        SumCalculator sca = new SumCalculator();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your 1St number: ");
        int a = sc.nextInt();
        System.out.println("enter your 2nd number: ");
        int b = sc.nextInt();
        System.out.println("enter your 3rd number: ");
        int c = sc.nextInt();
        System.out.println("The a number is " + a);
        System.out.println("The b number is " + b);
        System.out.println("The c number is " + c);
        int d = a + b + c;
        sca.sum(d);
    }
}

