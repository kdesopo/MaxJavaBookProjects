
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Counting alligators...\n");
		Countable a = new Alligator();
		count(a, 3);
		
		System.out.println("\nCounting sheep...\n");
		Sheep s = new Sheep();
		s.setName("Blacktie");
		Countable bt = s;
		count(bt, 2);
		bt.resetCount();
		Sheep d = (Sheep)s.clone();
		d.setName("Dolly");
		count(d,3);
		count(bt, 1);
	}
	
	public static void count(Countable c, int maxCount) {
		while (c.getCount() <= maxCount) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
		System.out.println("");
	}

}
