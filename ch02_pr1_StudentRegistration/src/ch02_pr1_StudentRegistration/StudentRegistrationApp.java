package ch02_prj1_StudentRegistration;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		int birthYear = 0;
		
		System.out.println("Student Registration Form");
		System.out.println("Enter first name: ");
		firstName = sc.next();
		System.out.println("Enter last name: ");
		lastName = sc.next();
		System.out.println("Enter year of birth: ");
		birthYear = sc.nextInt();
		
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " 
				+ firstName + "*" + birthYear);

	}

}
