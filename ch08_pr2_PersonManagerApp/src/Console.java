import java.util.Scanner;

public class Console {
	protected static Scanner sc = new Scanner(System.in);
	
	public static String getPersonType(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
		
			if(input.equals("") ) {
				System.out.println("Error! This entry is required. Try again.");
			} else if (input.equalsIgnoreCase("c")) {
				return "c";
			} else if (input.equalsIgnoreCase("e")) {
				return "e";
			} else {
				System.out.println("Error! Entry must be 'c' or 'e'. Try again.");
			}
		}
	}
	
	public static Person createPerson() {
		System.out.print("First name: ");
		String firstname = sc.next();
		System.out.print("Last name: ");
		String lastname = sc.next();
		Person p = new Person(firstname, lastname);
		return p;
	}
	
	public static String getPersonNum(String type) {
		String personnum = "";
		
		if (type.equalsIgnoreCase("c")) {
			System.out.print("Customer Number: ");
		} else {
			System.out.print("SSN: ");
		}
		
		personnum = sc.next();
		
		sc.nextLine();
		
		return personnum;
	}
	
	public static void printPerson(String type, Person p) {
		System.out.print("You entered a new ");
		
		if (type.equalsIgnoreCase("c")) {
			System.out.println("Customer:");
		} else {
			System.out.println("Employee:");
		}
		
		System.out.println(p.toString());
	}
	
	public static String getString(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
		
			if(input.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else if (input.equalsIgnoreCase("y")) {
				return input;
			} else if (input.equalsIgnoreCase("n")) {
				return input;
			} else {
				System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
			}
		}
	}
}

