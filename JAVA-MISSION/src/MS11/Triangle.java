package MS11;

public class Triangle {

	private double width;
	private double height;
	
	public Triangle() {
		this(1, 1);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height / 2;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
