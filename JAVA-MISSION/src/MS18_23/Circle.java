package MS18_23;

public class Circle extends Shape {

	double radius;

	public Circle() {
		
	}
	

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


}
