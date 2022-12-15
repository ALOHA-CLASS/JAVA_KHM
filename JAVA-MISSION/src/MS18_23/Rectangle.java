package MS18_23;

public class Rectangle extends Shape {

	double width, height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	@Override
	double area() {
		return width * height;
	}

	@Override
	double round() {
		return width * 3;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}


}
