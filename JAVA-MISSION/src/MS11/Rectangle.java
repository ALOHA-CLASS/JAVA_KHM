package MS11;

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		this(1, 1);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
