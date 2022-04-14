package com.trainning.sarita.bootcamp.assignment1;

public class VikramTax {
    public static void main(String[] args) {
        int incomewithtax = 85000;
        float taxrate = 0.20f;
        float taxamount = (incomewithtax-(incomewithtax / (1 + taxrate)));
        System.out.println("The tax amount paid by Vikram is :" + taxamount);


    }
}
