import java.util.Scanner;

public class Console {
	protected static Scanner sc = new Scanner(System.in);
	
	public static String getShapeType(String prompt) {
		System.out.print(prompt);
		String input = sc.nextLine();
		
			if (input.equalsIgnoreCase("c")) {
				return "c";
			} else if (input.equalsIgnoreCase("s")) {
				return "s";
			} else {
				return "r";
			}
	}
	
	public static double calculateArea(String type) {
		double area = 0.0;
		if (type.equalsIgnoreCase("c")) {
			System.out.print("\nEnter radius: ");
			double radius = sc.nextDouble();
			Circle c = new Circle(radius);
			area = c.getArea();
		} else if (type.equalsIgnoreCase("s")){
			System.out.print("\nEnter width: ");
			double width = sc.nextDouble();
			Square s = new Square(width);
			area = s.getArea();
		} else {
			System.out.print("\nEnter width: ");
			double width = sc.nextDouble();
			System.out.print("Enter height: ");
			double height = sc.nextDouble();
			Rectangle r = new Rectangle(width, height);
			area = r.getArea();
		}
		return area;
	}
	
	public static void printShape(String type, double area) {
		String shape = "";
		if (type.equalsIgnoreCase("c")) {
			shape = "Circle";
		} else if (type.equalsIgnoreCase("s")) {
			shape = "Square";
		} else {
			shape = "Rectangle";
		}
		System.out.println("\nThe area of the " + shape + " you entered is " + area + "\n");
		sc.nextLine();
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


