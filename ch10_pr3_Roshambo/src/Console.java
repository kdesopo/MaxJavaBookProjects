import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		String s  = null;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals("")) {
				System.out.println("Error! This entry is required. Try again.");				
			} else {
				isValid = true;
			}
		}
	
		return s;
	}
	
	public static String getString(String prompt, String s1, String s2) {
		String s = null;
		boolean isValid = false;
		while(!isValid) {
			System.out.print(prompt);
			s = sc.next();
			if (s.equals(s1) || s.equals(s2)) {
				isValid = true;
			} else {
				System.out.println("Error! Entry must be '" + s1 + 
						"' or '" + s2 + "'. Try again.");
				sc.nextLine();
			}
		}
		return s;
	}
	
	public static String getString(String prompt, String s1, String s2, String s3) {
		String s = null;
		boolean isValid = false;
		while(!isValid) {
			System.out.print(prompt);
			s = sc.next();
			if (s.equals(s1) || s.equals(s2) || s.equals(s3)) {
				isValid = true;
			} else {
				System.out.println("Error! Entry must be '" + s1 + 
						"' or '" + s2 + "' or '" + s3 + "'. Try again.");
				sc.nextLine();
			}
		}
		return s;
	}
	
	public static void printResults(Player p1, Player s) {
		Roshambo p1rosh = p1.getRoshvalue();
		Roshambo srosh = s.getRoshvalue();
		
		System.out.println(p1.getName() + ": " + p1rosh);
		System.out.println(s.getName() + ": " + srosh);
		
		if (p1rosh.equals(srosh)) {
			System.out.println("Draw!");
		} else if ((p1rosh.equals(Roshambo.rock) && srosh.equals(Roshambo.scissors)) ||
				p1rosh.equals(Roshambo.paper) && srosh.equals(Roshambo.rock)) {
			System.out.println(p1.getName() + " wins!");
			p1.addwin();
		} else {
			System.out.println(s.getName() + " wins!");
			s.addwin();
		}
	}
		
		public static void printWins(Player p1, Player s) {
			System.out.println("\nFinal Scores");
			System.out.println(p1.getName() + ": " + p1.getWins());
			System.out.println(s.getName() + ": " + s.getWins());
		}
		
	}
