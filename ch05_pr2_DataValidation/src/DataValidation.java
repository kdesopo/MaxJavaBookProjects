import java.util.Scanner;

public class DataValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			double length = getDoubleWithinRange(sc, "Enter length: ", 0.0, 1000000.0);
			double width = getDoubleWithinRange(sc, "Enter width: ", 0.0, 1000000.0);
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			choice = getString(sc, "\nContinue? (y/n): ");
		}

	}
	public static String getString(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			String choice = sc.nextLine();
		
			if (choice.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			}
			else if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
				sc.nextLine();
				return choice;
			}
			
			else {
				System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
			}
		}
		
	}
	public static double getDoubleWithinRange(Scanner sc, String prompt,
			double min, double max) {
		while (true) {
			System.out.print(prompt);
		
			if(sc.hasNextDouble()) {
				double decimal = sc.nextDouble();
				if(decimal <= min) {
					System.out.println("Error! Number must be greater than 0.0.");
				} else if(decimal >= max) {
					System.out.println("Error! Number must be less than 1000000.0");
				}
				else {
					sc.nextLine();
					return decimal;
				}
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine();
		}
	}
}
