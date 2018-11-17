package ch03_pr4_ChangeCalculator;

import java.util.Scanner;
public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			System.out.print("Quarters: ");
			int quarters = cents/25;
			cents -= quarters * 25;
			System.out.println(quarters);
			System.out.print("Dimes: ");
			int dimes = cents/10;
			cents -= dimes * 10;
			System.out.println(dimes);
			System.out.print("Nickels: ");
			int nickles = cents/5;
			cents -= nickles * 5;
			System.out.println(nickles);
			System.out.println("Pennies: " + cents);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
