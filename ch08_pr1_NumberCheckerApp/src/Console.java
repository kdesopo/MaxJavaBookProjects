import java.util.Scanner;

public class Console {
	protected static Scanner sc = new Scanner(System.in);
	
	public int getInt(String prompt) {
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
	
	public String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public void printOddEven(int n) {
		String check = "";
		if (n % 2 == 0) {
			check = "even";
		} else {
			check = "odd";
		}
		
		System.out.println("The number " + n + " is " + check + ".");
	}
	
}

