package shapes;

public class Circle extends Shape {
	
	// instance vars
	private double radius;
	
	
	// constructors
	/**
	 * creates a circle in the system
	 */
	public Circle() {
	}
	
	/**
	 * creates a circle with the radius set
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	// methods
	/**
	 * calculates the radius of the circle
	 */
	@Override
	public double calculateArea() {
		return ((Math.PI)*((this.radius)*(this.radius)));
	}

	/**
	 * calculates the perimeter of the circle 
	 */
	@Override
	public double calculatePerimeter() {
		return (2*(Math.PI) * (this.radius));
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
  
}
