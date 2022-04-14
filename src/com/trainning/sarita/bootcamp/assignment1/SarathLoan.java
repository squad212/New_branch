package com.trainning.sarita.bootcamp.assignment1;

public class SarathLoan {
    public static void main(String[] args) {
    int principle= 500000;
    int time = 5;
    float rate = 6.8f;

    float InterestAmount = (principle*time*rate/100);
    float FinalAmount = (principle+InterestAmount);

        System.out.println("The interest amount in priniciple is :" +InterestAmount);
        System.out.println("The final amount Sarath had to pay with interest is :" +FinalAmount);

    }
}
