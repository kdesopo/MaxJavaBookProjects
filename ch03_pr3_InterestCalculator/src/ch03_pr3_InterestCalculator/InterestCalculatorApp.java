package ch03_pr3_InterestCalculator;

import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount: ");
			BigDecimal l = new BigDecimal(sc.next());
			System.out.println("Enter interest rate: ");
			BigDecimal ir = new BigDecimal(sc.next());
			System.out.println();
			String loanAmount = moneyFormat.format(l);
			System.out.println("Loan amount: " + loanAmount);
			String interestRate = percent.format(ir);
			System.out.println("Interest rate: " + interestRate);
			BigDecimal interest = l.multiply(ir).setScale(2, RoundingMode.HALF_UP);
			String formattedInterest = moneyFormat.format(interest);
			System.out.println("Interest: " 
					+ formattedInterest);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
