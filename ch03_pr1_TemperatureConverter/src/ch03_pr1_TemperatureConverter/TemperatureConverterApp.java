package ch03_pr1_TemperatureConverter;

import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		NumberFormat celsiusFormat = NumberFormat.getNumberInstance();
		celsiusFormat.setMaximumFractionDigits(2);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter degrees in Fahrenheit: ");
			double f = sc.nextDouble();
			System.out.print("Degrees in Celsius: ");
			double c = (f-32) * 5/9;
			String stringC = celsiusFormat.format(c);
			System.out.println(stringC);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
