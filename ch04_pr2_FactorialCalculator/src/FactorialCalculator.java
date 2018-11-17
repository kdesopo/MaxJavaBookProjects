import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than "
					+ "0 and less than 10: ");
			int n = sc.nextInt();
			long factorial = 1;
			for (int i = 1; i < n+1; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + n + " is " + factorial + ".");
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			System.out.println("");
		}

	}

}
