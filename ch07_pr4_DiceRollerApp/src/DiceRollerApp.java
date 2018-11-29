import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("");
			Dice game = new Dice();
			game.roll();
			game.printRoll();
			System.out.print("\nRoll again? (y/n): ");
			choice = sc.next();
		}
		

	}

}
