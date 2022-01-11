package com.trainning.sarita.Basicproject.Udemy;
import java.util.Scanner;
public class UdemysetupTest {
    public static void main(String[] args) {
        Udemysetup Us= new Udemysetup();
        Scanner sc= new Scanner(System.in);
        System.out.println("HELLO TO BRUTIN NIVAS");
        String a= sc.next();
        System.out.println("You can come inside and feel as our own home");
        String b= sc.next();
        System.out.println("For the security reason we need your some information");
        String c= sc.next();
        System.out.println("Enter your first name");
        String d= sc.next();
        System.out.println("Enter your lastname");
        String e= sc.next();


       Us.welcome();
}
}