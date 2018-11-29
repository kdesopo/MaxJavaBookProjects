import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); //discard any other data entered on the line
		return s;
	}
	public static String getEmail(String prompt) {
		while(true) {
			System.out.print(prompt);
			String s = sc.next();
			if(s.indexOf("@") > -1 && s.indexOf(".") > -1) {
				sc.nextLine();
				return s;
			} else {
				sc.nextLine();
				System.out.println("Not a valid email address. Try again.");
			}
		}
	}
	public static String getPhone(String prompt) {
		while(true) {
			System.out.print(prompt);
			String s = sc.next();
			if(s.indexOf("-") == -1 && s.length() == 10) {
				sc.nextLine();
				return s;
			} else if (s.indexOf("-") > -1 && s.length() == 12) {
				sc.nextLine();
				return s;				
			} else {
				sc.nextLine();
				System.out.println("Not a valid phone number. Try again.");
			}
		}
	}	
}
