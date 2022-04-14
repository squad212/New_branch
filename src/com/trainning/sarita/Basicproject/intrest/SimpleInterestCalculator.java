package com.trainning.sarita.basicproject.intrest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    BigDecimal principle;
    BigDecimal interest;
    public SimpleInterestCalculator(String principle, String interest){
        this.principle =  new BigDecimal(principle);
        this.interest =new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalValue =
        principle.add(principle.multiply(interest).multiply(new BigDecimal(noOfYears)));
        return totalValue;

    }
}
