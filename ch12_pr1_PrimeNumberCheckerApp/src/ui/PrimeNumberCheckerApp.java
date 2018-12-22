package ui;

import java.util.ArrayList;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		String choice = "y";
		int numPick = 0;
		ArrayList<Integer> factors = new ArrayList<>();
		
		System.out.println("Prime Number Checker");
		
		while(choice.equalsIgnoreCase("y")) {
			numPick = Console.getInt("\nPlease enter an integer between 1 and 5000: ", 1, 5000);
			
			for(int n = 1; n <= numPick; n++) {
				if(numPick % n == 0) {
					factors.add(n);
				}
			}
			
			Console.displayFactors(numPick, factors);

			choice = Console.getString("Try again? (y/n): ", "y", "n");
		}
		
		System.out.println("\nBye!");

	}

}
