package desopo.app;

import desopo.account.*;
import desopo.presentation.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account application\n");
		System.out.println("Starting Balances");
		System.out.println("Checking: $1,000.00");
		System.out.println("Savings: $1,000.00\n");
		System.out.println("Enter the transactions for the month");
		
		CheckingAccount c = new CheckingAccount(1.0);
		c.setBalance(1000.0);
		c.minusMonthlyFee();
		
		SavingsAccount s = new SavingsAccount(0.01);
		s.setBalance(1000.0);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String transaction = Console.getString("\nWithdrawal or deposit? (w/d): ");
			String acct = Console.getString("Checking or savings? (c/s): ");
			Account a = null;
			if (acct.equalsIgnoreCase("c")) {
				a = c;
			} else if (acct.equalsIgnoreCase("s")) {
				a = s;
			}
			Console.getAmount("Amount?: ", transaction, a);
			choice = Console.getString("\nContinue? (y/n): ");
		}
		
		Console.printReceipt(c, s);
	}
}
