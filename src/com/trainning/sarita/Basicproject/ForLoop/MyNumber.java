package com.trainning.sarita.Basicproject.ForLoop;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        // Because negative and 1 cant be prime number
        if (number < 2) {
            return false;
        }
        // use the % modulos which is reminder
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                sum = sum + i;
            }
        return sum;
    }


    public void numberTriangle() {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();// it helps to print line in different line.
        }
    }
}
