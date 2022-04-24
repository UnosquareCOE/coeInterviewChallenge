package shapes;

public class Square extends Shape {
	// Add Code Here
	// instance vars
	private double side;
	
	// default constructor
	public Square() {

	}

	// constructor with args
	public Square(double side) {
		this.side = side;
	}

	/**
	 * @return - side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * set the length of the square sides
	 * 
	 * @param side
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Calculates the area of the square
	 * 
	 * @return - area
	 */
	@Override
	public double calculateArea() {
		double area = Math.pow(side, 2);
		return area;
	}

	/**
	 * Calculates the perimeter of the square
	 * 
	 * @return - perimeter
	 */
	@Override
	public double calculatePerimeter() {
		double perimeter = side*4;
		return perimeter;
	}
}

