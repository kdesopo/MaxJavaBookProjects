package ui;

import business.Student;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("The Student Scores application");
		
		int numStudents = Console.getInt("\nNumber of students: ", 1, 500);
		Student[] students = new Student[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			System.out.println("\nSTUDENT " + (i+1)); 
			String lastName = Console.getString("Last name: ");
			 String firstName = Console.getString("First name: ");
			 int score = Console.getInt("Score: ", 0, 100);
			 
			 students[i] = new Student(firstName, lastName, score);
		}
		
		Console.displayStudents(students);

	}

}
