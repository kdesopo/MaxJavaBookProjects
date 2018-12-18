
public abstract class Player {
	private String name;
	private Roshambo roshvalue;
	private int wins = 0;
	
	public int getWins() {
		return wins;
	}
	public void addwin() {
		wins++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getRoshvalue() {
		return roshvalue;
	}
	public void setRoshvalue(Roshambo roshvalue) {
		this.roshvalue = roshvalue;
	}
	
	public abstract void generateRoshambo();
	
}
