package shapes;

// width, height
public class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return width * height;

	}

	public double calculatePerimeter() {
		return (2 * width) + (2 * height);
		
	}
}
