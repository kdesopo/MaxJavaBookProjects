
public class SavingsAccount extends Account {
	private double monthlyrate = 0.0;
	private double mnthlyinterest = 0.0;
	
	SavingsAccount(double monthlyrate) {
		this.monthlyrate = monthlyrate;
	}

	public double getMnthlyinterest() {
		return mnthlyinterest;
	}
	
	public void addInterestPay() {
		double curBalance = getBalance();
		mnthlyinterest = curBalance * monthlyrate;
		setBalance(curBalance + mnthlyinterest);
	}
}
