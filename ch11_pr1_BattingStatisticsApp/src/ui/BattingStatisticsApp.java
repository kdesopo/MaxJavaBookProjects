package ui;

import business.Player;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int atBatCt = Console.getInt("\nEnter number of times at bat: ", 1, 30);
			System.out.println("0 = out, 1 = single, 2 = double, "
					+ "3 = triple, 4 = home run");
			Player p = new Player(atBatCt);
			
			for (int i = 0; i < atBatCt; i++) {
				int res = Console.getInt("Result for at-bat "+ (i + 1) + ": ", 0, 4);
				p.addBatRes(res, i);
			}
			
			p.calcBatAvg();
			p.calcslugPercent();
			Console.displayStats(p);
			System.out.println();
			choice = Console.getString("Another player? (y/n): ");
		}
		
		System.out.println("\nBye!");
	}

}
