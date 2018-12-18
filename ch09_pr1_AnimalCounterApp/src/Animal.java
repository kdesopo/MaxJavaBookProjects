
public abstract class Animal implements Countable {
	private int count = 1;

	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		count = 1;
		
	}

	@Override
	public String getCountString() {
		return count + "";
	}

}
