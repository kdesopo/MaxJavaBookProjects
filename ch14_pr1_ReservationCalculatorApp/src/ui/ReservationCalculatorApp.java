package ui;

import java.time.LocalDate;
import business.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		String choice = "y";
		System.out.println("Reservation Calculator");
		
		while(choice.equalsIgnoreCase("y")) {
			int month = Console.getInt("\nEnter the arrival month (1-12): ", 1, 12);
			int day = Console.getInt("Enter the arrival day (1-31): ", 1, 31);
			int year = Console.getInt("Enter the arrival year: ");
			
			int month2 = Console.getInt("\nEnter the departure month (1-12): ", 1, 12);
			int day2 = Console.getInt("Enter the departure day (1-31): ", 1, 31);
			int year2 = Console.getInt("Enter the departure year: ");
			
			LocalDate arrival = LocalDate.of(year, month, day);
			LocalDate depart = LocalDate.of(year2, month2, day2);
			
			Reservation res = new Reservation(arrival, depart);
			
			Console.printBill(res);
			
			choice = Console.getString("\nContinue? (y/n): ");	
		}
	}

}
