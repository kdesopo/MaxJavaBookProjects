import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Guess the Number Game\n");

		while (choice.equals("y")) {
			promptUser();

			int randNum = (int)((Math.random() * 100) + 1);
			int guess = 0;
			int count = 0;

			while (guess != randNum) {
				guess = getIntWithinRange(sc, "Enter number: ", 1, 100);
				count++;
				checkGuessEqualsRand(guess, randNum, count);
			}
			
			choice = promptUserAgain(sc, "\nPlay again? (y/n): ");
		}
		
		System.out.println("\nBye - Come back soon!");
	}

	public static void promptUser() {
		System.out.println("I'm thinking of a number from 1 to 100.\n" + 
				"Try to guess it.");
	}

	private static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {

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

	private static void checkGuessEqualsRand(int guess, int randNum, int count) {
		if (guess != randNum) {
			if (guess - randNum <= -10) {
				System.out.println("Way too low! Guess again.");
			} else if (guess - randNum >= 10) {
				System.out.println("Way too high! Guess again.");
			} else if (randNum > guess) {
				System.out.println("Too low! Guess again.");
			} else if (randNum < guess) {
				System.out.println("Too high! Guess again.");
			}

		} else {
			System.out.println("You got it in " + count + " tries.");
			if (count <= 3) {
				System.out.println("Great work! You are a mathmatical wizard.");
			} else if (count <= 7) {
				System.out.println("Not too bad! You've got some potential.");
			} else {
				System.out.println("What took you so long? " +
						"Maybe you should take some lessons.");
			}
		}
	}
	
	public static String promptUserAgain(Scanner sc, String prompt) {
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
