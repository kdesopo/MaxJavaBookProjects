package business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Flight {
	private LocalDateTime departDT;
	private int mi;
	private int mph;
	
	public Flight(LocalDateTime departDT, int mi, int mph) {
		this.departDT = departDT;
		this.mi = mi;
		this.mph = mph;
	}

	public int getTravelHrs() {
		return mi/mph;
	}
	
	public int getTravelMin() {
		double travelTime = (double)mi/(double)mph;
		int min = (int)Math.round((travelTime - getTravelHrs()) * 60);
		return min;
	}
	
	public LocalDateTime getArriveDT() {
		LocalDateTime arriveDT = departDT.plus((long)getTravelHrs(),ChronoUnit.HOURS);
		arriveDT = arriveDT.plus((long)getTravelMin(),ChronoUnit.MINUTES);
		return arriveDT;
	}
	
	public LocalDate getArriveDate() {
		return getArriveDT().toLocalDate();
	}
	
	public String getArriveDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return dtf.format(getArriveDate());
		
	}
	
	public LocalTime getArriveTime() {
		return getArriveDT().toLocalTime();
	}
	
	public String getArriveTimeFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		return dtf.format(getArriveTime());
	}
	public LocalDateTime getDepartDT() {
		return departDT;
	}

	public void setDepartDT(LocalDateTime departDT) {
		this.departDT = departDT;
	}

	public int getMi() {
		return mi;
	}

	public void setMi(int mi) {
		this.mi = mi;
	}

	public int getMph() {
		return mph;
	}

	public void setMph(int mph) {
		this.mph = mph;
	}
}
