package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private final double NIGHTLY_RATE = 145.00;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;	
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(arrivalDate);
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(departureDate);
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public int getNumberofNights() {
		return (int)ChronoUnit.DAYS.between(arrivalDate, departureDate);
	}
	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(NIGHTLY_RATE);
	}
	public double getTotalPrice() {
		return getNumberofNights() * NIGHTLY_RATE;
	}
	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotalPrice());
	}	
}
