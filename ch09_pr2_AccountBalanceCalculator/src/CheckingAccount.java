
public class CheckingAccount extends Account {
	private double mthlyfee = 0.0;
	
	public CheckingAccount(double mthlyfee) {
		this.mthlyfee = mthlyfee;
	}

	public double getMthlyfee() {
		return mthlyfee;
	}
	
	public void minusMonthlyFee() {
		setBalance(getBalance() - mthlyfee);
	}
}
