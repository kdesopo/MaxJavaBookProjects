package ui;

import java.time.LocalDateTime;
import business.Flight;

public class ArrivalTimeEstimatorApp {

	public static void main(String[] args) {
		String choice = "y";
		System.out.println("Arrival Time Estimator");
		
		while(choice.equalsIgnoreCase("y")) {
			String ld = Console.getString("\nDeparture date (YYYY-MM-DD): ");
			String lt = Console.getString("Departure time (HH:MM): ");
			LocalDateTime ldt = LocalDateTime.parse(ld +"T" + lt);
			int miles = Console.getInt("Number of miles: ");
			int mph = Console.getInt("Miles per hour: ");
			Flight flight = new Flight(ldt, miles, mph);
			Console.printItin(flight);
			choice = Console.getString("\nContinue? (y/n): ");	
		}
	}
}
