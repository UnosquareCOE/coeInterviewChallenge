package shapes;

public class Rectangle extends Shape {
	// Add Code Here

	public double width;
	public double height;

	// CONSTRUCTOR based on Test class
	// Public so no getters/setters
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// OVERRIDE PARENT SHAPE CLASS
	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return (2 * width) + (2 * height);
	}
}
