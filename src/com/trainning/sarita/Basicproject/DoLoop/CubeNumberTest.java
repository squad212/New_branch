package com.trainning.sarita.Basicproject.DoLoop;

import java.util.Scanner;

public class CubeNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// making a loop while will occur until user give the negative number

        int number = -1;
        do {
            if (number != -1){
                System.out.println("Cube is : " + (number * number * number));
            }
            System.out.println("Enter a number ");
            number = sc.nextInt();
        } while (number >= 0);
        System.out.println("Thank You");
    }
}