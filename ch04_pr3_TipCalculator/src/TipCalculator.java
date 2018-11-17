import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class TipCalculator {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Cost of meal: ");
			BigDecimal cost = sc.nextBigDecimal();
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMaximumFractionDigits(0);
			NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
			System.out.println();
			
			for(double tip = 0.15; tip < 0.30; tip+=0.05) {
				System.out.println(percentFormat.format(tip));
				BigDecimal bdTip = new BigDecimal(tip); 
				BigDecimal totalTip = bdTip.multiply(cost);
				System.out.println("Tip Amount: " + moneyFormat.format(totalTip));
				System.out.println("Total Amount: " + moneyFormat.format(cost.add(totalTip)));
				System.out.println();
			}
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}

}
