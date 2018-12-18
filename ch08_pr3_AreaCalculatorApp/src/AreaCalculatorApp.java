
public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String shapetype = Console.getShapeType("\nCalculate area of a circle, "
					+ "square, or rectangle? (c/s/r): ");
			double area = Console.calculateArea(shapetype);
			Console.printShape(shapetype, area);
			
			choice = Console.getString("Continue? (y/n): ");
			
		}

	}

}
