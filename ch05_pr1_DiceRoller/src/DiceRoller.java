import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("Dice Roller\n");
		firstUserPrompt();
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		while(choice.equalsIgnoreCase("y")) {
			int firstRoll = rollDie1();
			int secondRoll = rollDie2();
			int total = firstRoll + secondRoll;
			
			System.out.println("Die 1: " + firstRoll);
			System.out.println("Die 2: " + secondRoll);
			System.out.println("Total: " + total);
			
			if (total == 2) {
				System.out.println("Snake eyes!");
			} else if (total == 12) {
				System.out.println("Boxcars!");
			}
			System.out.println();
			System.out.print("Roll again? (y/n): ");
			
			choice = sc.next();
		}

	}
	
	public static void firstUserPrompt() {
		System.out.print("Roll the dice? (y/n): ");
	}
	
	public static int rollDie1() {
		int die1Roll = (int) (Math.random() * 6) + 1;
		return die1Roll;
	}
	
	public static int rollDie2() {
		int die2Roll = (int) (Math.random() * 6) + 1;
		return die2Roll;
	}

}
