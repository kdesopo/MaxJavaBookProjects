import java.util.Scanner;
import java.text.NumberFormat;

public class Console {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String choice = sc.next();
		sc.nextLine();
		return choice;
	}
	
	public static void getAmount(String prompt, String t, Account a) {
		double amnt = 0.0;
		double curBalance = a.getBalance();
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				amnt = sc.nextDouble();
				if (t.equalsIgnoreCase("d")) {
					a.setBalance(curBalance + amnt);
					isValid = true;
				} else if (t.equalsIgnoreCase("w") && amnt > curBalance) {
					System.out.println("Insufficent funds! You have $" + curBalance);
				} else {
					a.setBalance(curBalance - amnt);
					isValid = true;
				}
			} else {
				System.out.println("Error! Invalid number. Try again.");
			}
			sc.nextLine();
		}
	}
	
	public static void printReceipt(CheckingAccount c, SavingsAccount s) {
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		System.out.println("\nMonthly Payments and Fees");
		System.out.println("Checking fee: " + moneyFormat.format(c.getMthlyfee()));
		s.addInterestPay();
		System.out.println("Savings interest payment: " + moneyFormat.format(s.getMnthlyinterest()) + "\n");
		System.out.println("Final Balances");
		System.out.println("Checking: " + moneyFormat.format(c.getBalance()));
		System.out.println("Savings: " + moneyFormat.format(s.getBalance()));
	}
}
