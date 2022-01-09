package com.trainning.sarita.Basicproject.GreaterOrLes;
import com.trainning.sarita.Basicproject.GreaterOrLes.GreaterOrLess;

import java.util.Scanner;

public class GreaterOrLessTest {

    public static void main(String[] args) {
        GreaterOrLess eg = new GreaterOrLess();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your a number: ");
        int a = sc.nextInt();
        System.out.println("enter your b number: ");
        int b = sc.nextInt();
        System.out.println("enter your c number: ");
        int c = sc.nextInt();
        System.out.println("enter your d number: ");
        int d = sc.nextInt();
        System.out.println("The a number is " + a);
        System.out.println("The b number is " + b);
        System.out.println("The c number is " + c);
        System .out.println("The d number is " + d);
        int e = a + b; //initialization
        int f = c + d;
        System.out.println("The sum of a + b is: " + e);
        System.out.println("The sum of c + d is: " + f);
        eg.greaterThan(e,f);

        System.out.println("-----------------------------------------------------");
        System.out.println("enter your table: ");
        int table = sc.nextInt();;
        int i =1;
        for( i =1; i<=10; i++) {
            System.out.printf( "%d * %d= %d", table, i, table*i).println();

        }
    }
}