package business;

public class Player {
	private int[] batRes;
	private double batAvg = 0.0;
	private double slugPercent = 0.0;
	
	public Player(int atBatCt) {
		batRes = new int[atBatCt];
	}
	
	public int[] getBatRes() {
		return batRes;
	}
	public void setBatRes(int[] batRes) {
		this.batRes = batRes;
	}
	public double getBatAvg() {
		return batAvg;
	}

	public double getSlugPercent() {
		return slugPercent;
	}
	
	public void addBatRes (int result, int index) {
		batRes[index] = result;
	}
	
	public void calcBatAvg() {
		double ct = 0;
		for (int i = 0; i < batRes.length; i++) {
			if (batRes[i] > 0) {
				ct++;
			}
		}
		
		batAvg = ct / batRes.length;
	}
	
	public void calcslugPercent() {
		double sum = 0;
		for (int i = 0; i < batRes.length; i++) {
			sum += batRes[i];
		}
		
		slugPercent = sum / batRes.length;
	}
	
	

}
