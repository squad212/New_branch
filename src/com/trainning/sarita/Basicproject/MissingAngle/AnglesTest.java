package com.trainning.sarita.Basicproject.MissingAngle;

import java.util.Scanner;
public class AnglesTest {
    public static void main(String[] args) {

        Angles an = new Angles();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your 1St angle: ");
        double a = sc.nextDouble();
        System.out.println("enter your 2nd angle: ");
        double b = sc.nextDouble();
        double d = (180.00);
        double c = d - (a + b);
        an.findAngles(c);
    }
}
