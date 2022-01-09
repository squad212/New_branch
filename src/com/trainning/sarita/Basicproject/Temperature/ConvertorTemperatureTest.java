package com.trainning.sarita.Basicproject.Temperature;

import java.util.Scanner;

public class ConvertorTemperatureTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the temperature convertor ");
		System.out.println("What type of temperature do you have? type C for celicus and F for frenhight ");
		String sym = sc.nextLine();
		System.out.println("Enter your temperature: ");
		double temp = sc.nextDouble();
		ConvertorTemperature ct = new ConvertorTemperature();
		ct.calculator(sym, temp);
		sc.close();
	}

}
