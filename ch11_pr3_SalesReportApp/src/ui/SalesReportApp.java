package ui;

import java.text.NumberFormat;

public class SalesReportApp {

	public static void main(String[] args) {
		System.out.println("The Sales Report application");
		
		double[][] sales = {
				{1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
				{1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
				{1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
				{1105.0, 4102.0, 2391.0, 1576.0} // Region 4
				};
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String report1 = "\nRegion\tQ1\t\tQ2\t\tQ3\t\tQ4\n";
		
		for (int r = 0; r < 4; r++) {
			report1 += (r+1) + "\t";
			for (int c = 0; c < 4; c++) {
				report1 += currency.format(sales[r][c]) + "\t";
			}
			report1 += "\n";
		}
		
		System.out.println(report1);
		
		System.out.println("\nSales by region: ");
		for (int r = 0; r < 4; r++) {
			System.out.print("Region " + (r+1) + ": ");
			double sum = 0.0;
			for (int c = 0; c < 4; c++) {
				sum += sales[r][c];
			}
			System.out.println(currency.format(sum));
		}
		
		System.out.println("\nSales by quarter: ");
		for (int c = 0; c < 4; c++) {
			System.out.print("Q" + (c+1) + ": ");
			double sum = 0.0;
			for (int r = 0; r < 4; r++) {
				sum += sales[r][c];
			}
			System.out.println(currency.format(sum));
		}
		
		System.out.print("\nTotal Sales: ");
		double sum = 0.0;
		
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				sum += sales[r][c];
			}
		}
		
		System.out.println(currency.format(sum));
	}

}
