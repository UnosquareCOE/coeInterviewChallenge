package shapes;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double calculateArea() {
		return radius * radius * Math.PI;

	}

	public double calculatePerimeter() {
		return radius * 2 * Math.PI;
	}
}
