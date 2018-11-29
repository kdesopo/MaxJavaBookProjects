
public class GuessingGameApp {

	public static void main(String[] args) {
		String choice = "y";

		System.out.println("Welcome to the Guess the Number Game\n");

		while (choice.equals("y")) {
			Console.promptUser();
			Game game = new Game();
			do {
				game.setGuess(
						Console.getIntWithinRange("Enter number: ", 1, 100));
				game.add1Count();
				String message = game.checkGuessEqualsRand();
				System.out.println(message);				
			} while (game.getGuess() != game.getRandNum());
			
			choice = Console.promptUserAgain("\nPlay again? (y/n): ");
		}
		
		System.out.println("\nBye - Come back soon!");
	}
}
