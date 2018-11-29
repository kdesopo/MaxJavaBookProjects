import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);

	public static void promptUser() {
		System.out.println("I'm thinking of a number from 1 to 100.\n" + 
				"Try to guess it.");
	}

	public static int getIntWithinRange(String prompt, int min, int max) {

		while (true) {
			System.out.print(prompt);

			if (sc.hasNextInt()) {
				int inputInt = sc.nextInt();

				if (inputInt < min) {
					System.out.println("Your guess must be at least 1. Try again.");
				} else if (inputInt > max) {
					System.out.println("Your guess can't be greater than 100. Try again.");
				} else {
					sc.nextLine();
					return inputInt;
				}
			} else {
				System.out.println("That's not an integer. Try again.");
			}

			sc.nextLine();
		}
	}
	
	public static String promptUserAgain(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
		
			if(input.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else if (input.equals("y")) {
				return "y";
			} else if (input.equals("n")) {
				return "n";
			} else {
				System.out.println("Error! Entry must be 'y' or 'n'. " + 
					"This is case sensitive. Try again.");
			}
		}
	}	
}

