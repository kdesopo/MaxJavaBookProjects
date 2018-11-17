package ch02_pr2_GradeConverter;

import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		int numGrade = 0;
		String letterGrade = "";
		
		while (!choice.equalsIgnoreCase("n")) {
			System.out.println("Welcome to the Letter Grade Converter");
			System.out.println("Enter numerical grade: ");
			numGrade = sc.nextInt();
			if (numGrade >= 88) {
				letterGrade = "A";
			}
			else if (numGrade >= 80) {
				letterGrade = "B";
			}
			else if (numGrade >= 67) {
				letterGrade = "C";
			}
			else if (numGrade >= 60) {
				letterGrade = "D";
			}
			else {
				letterGrade = "F";
			}
			System.out.println("Letter grade: " + letterGrade);
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}

	}

}
