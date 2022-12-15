package MS18_23;

public class Triangle extends Shape {

	double width, height;

	public Triangle() {
		super();
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	@Override
	double area() {
		return width * height / 2;
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
