
public class NumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!");
		String choice = "y";
		MyConsole mc = new MyConsole();
		
		while (choice.equalsIgnoreCase("y")) {
			int num = mc.getInt("Enter integer: ");
			mc.printOddEven(num);
			choice = mc.getString("Continue? (y/n): ");
		}
	}

}
