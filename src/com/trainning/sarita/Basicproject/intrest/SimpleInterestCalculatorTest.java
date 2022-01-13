package com.trainning.sarita.Basicproject.intrest;

import java.math.BigDecimal;



public class SimpleInterestCalculatorTest {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500","7.5");
        BigDecimal totalValue= calculator.calculateTotalValue(5);
        System.out.println(totalValue);


    }
}
