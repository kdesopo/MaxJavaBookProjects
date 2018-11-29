
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			int gradeNum = Console.getInt("Enter numerical grade: ", 0, 100);
			Grade grade = new Grade(gradeNum);
			System.out.println("Letter grade: " + grade.getLetter());
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}

	}

}
