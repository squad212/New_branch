package com.trainning.sarita.bootcamp.assignment1;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price;
        int quantity;
        int discount;

        System.out.println("Enter the price of pizza : ");
        price = sc.nextInt();

        System.out.println("Enter how many pizza brought: ");
        quantity = sc.nextInt();

        System.out.println("Enter the discount percent of pizza : ");
        discount = sc.nextInt();

        int finalPrice = (price*quantity-(price*quantity*discount/100));
        System.out.println("The final price of pizza after discount is : " +finalPrice);


        System.out.println("This answer is from different method ");

        int price1= 399;
        int quantity1=2;
        //Write the Percent number only no symbol.
        int discount1=20;
        int finalPrice1 = (price1*quantity1-(price1*quantity1*discount1/100));
        System.out.println("The final price of pizza after discount is : " +finalPrice1);
    }

    public static void Alternative(String[] args) {
        int price= 399;
        int quantity=2;
        //Write the Percent number only no symbol.
        int discount=20;
        int finalPrice = (price*quantity-(price*quantity*discount/100));
        System.out.println("The final price of pizza after discount is : " +finalPrice);
    }
}
