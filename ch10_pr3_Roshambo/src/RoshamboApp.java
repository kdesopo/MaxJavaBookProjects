
public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Roshambo");
		String choice = "y";
		Player person = new Player1();
		Player simpson = null;
		
		String name = Console.getString("\nEnter your name: ");
		
		person.setName(name);
		
		String opponent = Console.getString("\nWould you like to play Bart or Lisa? (B/L): "
				, "B", "L");
		
		if (opponent.equals("B")) {
			simpson = new Bart();
			simpson.setName("Bart");
		} else if (opponent.equals("L")) {
			simpson = new Lisa();
			simpson.setName("Lisa");
		}
		
		while(choice.equalsIgnoreCase("y")) {
			
			simpson.generateRoshambo();
			
			String move = Console.getString("\nRock, paper, or scissors? (R/P/S): ", 
					"R", "P", "S");
			
			if (move.equals("R")) {
				person.setRoshvalue(Roshambo.rock);
			} else if (move.equals("P")) {
				person.setRoshvalue(Roshambo.paper);
			} else {
				person.setRoshvalue(Roshambo.scissors);
			}
			
			Console.printResults(person, simpson);
			
			choice = Console.getString("\nPlay again? (y/n): ", "y", "n");
			
			if (choice.equals("n")) {
				Console.printWins(person, simpson);
			}
		}
	}

}
