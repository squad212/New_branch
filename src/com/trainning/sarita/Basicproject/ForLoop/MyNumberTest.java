package com.trainning.sarita.Basicproject.ForLoop;

public class MyNumberTest {
    public MyNumberTest() {
        super();
    }

    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);

        // for prime number
        boolean isPrime = number.isPrime();
        System.out.println("The Number is Prime : " + isPrime);

        // for sum of the number
        int sum = number.sumUptoN();
        System.out.println("sum of the numbers : " + sum);

        // sum of all the divisor except 1 and itself
        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("The sum of Divisors : " + sumOfDivisors);

        // Making tree of the number
        number.numberTriangle();




    }
}
