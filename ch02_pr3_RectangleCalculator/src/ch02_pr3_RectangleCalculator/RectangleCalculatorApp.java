package ch02_pr3_RectangleCalculator;

import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		double l = 0.0;
		double w = 0.0;
		double a = 0.0;
		double p = 0.0;
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		while(!choice.equalsIgnoreCase("n")) {
			System.out.println("Enter length: ");
			l = sc.nextDouble();
			System.out.println("Enter width: ");
			w = sc.nextDouble();
			a = l*w;
			p = 2*l + 2*w;
			System.out.println("Area: " + a);
			System.out.println("Perimeter: " + p);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
