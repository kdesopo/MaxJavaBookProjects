package ch03_pr2_TravelTimeCalculator;

import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.println("Enter miles per hour: ");
			double mph = sc.nextDouble();
			
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours: " + (int)(miles/mph));
			System.out.println("Minutes: " + (int)(miles % mph));
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
