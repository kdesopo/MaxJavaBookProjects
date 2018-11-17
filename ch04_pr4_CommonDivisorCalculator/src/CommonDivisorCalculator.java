import java.util.Scanner;


public class CommonDivisorCalculator {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first number: ");
			int firstInt = sc.nextInt();
			System.out.print("Enter second number: ");
			int secondInt = sc.nextInt();
			System.out.print("Greatest common divisor: ");
			
			while(firstInt > 0) {
				while(secondInt >= firstInt) {
					secondInt -= firstInt;
					}
				if(secondInt < firstInt) {
					int swap = firstInt;
					firstInt = secondInt;
					secondInt = swap;
				}
			}
			int gcd = secondInt;
			System.out.println(gcd);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}
//	1. Subtract x from y repeatedly until y < x.
//	2. Swap the values of x and y.
//	3. Repeat steps 1 and 2 until x = 0.
//	4. y is the greatest common divisor of the two numbers.
}
