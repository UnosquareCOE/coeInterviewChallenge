package shapes;

/**
 * Circle class
 * 
 * @author Nicola McGowan
 */
public class Circle extends Shape {
	private static final double RADIUS = 5;

	private double radius;

	/**
	 * Constructor
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculates area of a circle
	 */
	@Override
	public double calculateArea() {
		final double area = RADIUS * RADIUS * Math.PI;
		return area;
	}

	/**
	 * Calculates perimeter of a circle
	 */
	@Override
	public double calculatePerimeter() {
		final double perimeter = RADIUS * 2 * Math.PI;
		return perimeter;
	}
}
