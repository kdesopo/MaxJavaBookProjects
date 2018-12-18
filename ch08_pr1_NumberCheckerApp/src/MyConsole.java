
public class MyConsole extends Console {
	@Override
	public String getString(String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine();
		
			if(input.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else {
				return input;
			}
		}
	}
}
