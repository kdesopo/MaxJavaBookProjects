
public class Sheep extends Animal implements Cloneable {
	private String name = "Unknown";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getCountString() {
		return super.getCountString() + " " + name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
