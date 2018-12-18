
public class Circle extends Shape {
	
	private double radius = 0.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

}
