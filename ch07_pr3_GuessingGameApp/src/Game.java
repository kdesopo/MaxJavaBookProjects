
public class Game {
	
	private int randNum = (int)((Math.random() * 100) + 1);
	private int guess = 0;
	private int count = 0;
		
	public int getRandNum() {
		return randNum;
	}

	public int getGuess() {
		return guess;
	}


	public void setGuess(int guess) {
		this.guess = guess;
	}


	public int getCount() {
		return count;
	}

	public void add1Count() {
		count++;
	}
	public String checkGuessEqualsRand() {
		if (guess != randNum) {
			if (guess - randNum <= -10) {
				return "Way too low! Guess again.";
			} else if (guess - randNum >= 10) {
				return "Way too high! Guess again.";
			} else if (randNum > guess) {
				return "Too low! Guess again.";
			} else {
				return "Too high! Guess again.";
			}

		} else {
			System.out.println("You got it in " + count + " tries.");
			if (count <= 3) {
				return "Great work! You are a mathmatical wizard.";
			} else if (count <= 7) {
				return "Not too bad! You've got some potential.";
			} else {
				return "What took you so long? " +
						"Maybe you should take some lessons.";
			}
		}
	}
}
