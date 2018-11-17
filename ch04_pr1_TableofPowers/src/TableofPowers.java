import java.util.Scanner;

public class TableofPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes Table \n");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String header = "Number\tSquared\tCubed\n" + 
			"======\t=======\t=====\n";
			
			String data = "";
			for(int i = 1; i < n + 1; i++) {
				int square = i * i;
				int cube = i * i * i;
				data+= i + "\t" + square + "\t" + cube + "\n";	
			}
			
			System.out.println(header + data);
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println("");
		}

	}

}
