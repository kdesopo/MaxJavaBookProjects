import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); //discard any other data entered on the line
		return s;
	}
	
	public static String getString(String prompt, 
			String choice1, String choice2) {
		while(true) {
			System.out.print(prompt);
			String s = sc.nextLine();
			
			if(s.equals("")) {
				System.out.println(
						"Error! This entry is required. Try again.");				
			} else if (s.equals(choice1) || s.equals(choice2)) {
				return s;
			} else {
				System.out.println(
					"Error! Entry must be 'y' or 'n'. Try again.");
			}
		
		}
	}
	
	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine();
		}
		return i;
	}
	public static int getInt(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
			i = getInt(prompt);
			if (i < min) {
				System.out.println(
						"Error! Number must be greater than or equal to " + min + ".");
			} else if (i > max) {
				System.out.println(
						"Error! Number must be less than or equal to " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}
}

