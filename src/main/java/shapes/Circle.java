package shapes;

public class Circle extends Shape {

	// Add Code Here
	// instance vars
	private double radius;

	// default constructor
	public Circle() {

	}

	// constructor with args
	public Circle(double radius) {
		this.radius = radius;
	}

	// methods
	/**
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * sets the double to radius value input
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculates the area of the circle
	 * 
	 * @return - area
	 */
	@Override
	public double calculateArea() {
		double area;
		area =   Math.PI * Math.pow(radius, 2);
		return area;
	}

	/**
	 * Calculates the perimeter of the circle
	 * 
	 * @return - perimeter
	 */
	@Override
	public double calculatePerimeter() {
		double perimeter;
		perimeter = radius * 2 * Math.PI;
		return perimeter;
	}

}
