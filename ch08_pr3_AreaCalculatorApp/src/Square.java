
public class Square extends Shape {
	
	protected double width = 0.0;
	
	public Square(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return Math.pow(width, 2);
	}

}
