package com.trainning.sarita.bootcamp.assignment1;

public class HimaSalary {
    public static void main(String[] args) {
        int BasicSalary = 85000;
        float ta = (15*85000/100);
        float Da = (20*85000/100);
        float hra = (18*85000/100);
        float pf = (20*85000/100);
        float tax= (25*85000/100);

        float GrossAmount = (BasicSalary+ta+Da+hra);
        float NetAmount = (GrossAmount-(pf+tax));

        System.out.println("The GrossAmount is: " +GrossAmount);
        System.out.println("The NetAmount is: "+NetAmount);
    }
}
