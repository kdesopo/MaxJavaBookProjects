
public class Dice {
	
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	public int getDie1value() {
		return die1.getValue();
	}

	public int getDie2value() {
		return die2.getValue();
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public int getSum() {
		return die1.getValue() + die2.getValue();
	}
	
	public void printRoll() {
		System.out.println("Die 1: " + getDie1value());
		System.out.println("Die 2: " + getDie2value());
		int total = getSum();
		System.out.println("Total: " + total);
		if (total == 7) {
			System.out.println("Craps!");
		} else if (total == 2) {
			System.out.println("Snake eyes!");
		} else if (total == 12) {
			System.out.println("Box cars!");
		}
	}
}
