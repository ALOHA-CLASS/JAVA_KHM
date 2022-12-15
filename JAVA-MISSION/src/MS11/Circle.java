package MS11;

public class Circle {

	private double radius;
	final static double PI = 3.1415926535;
	
	public Circle() {
		this(1);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
