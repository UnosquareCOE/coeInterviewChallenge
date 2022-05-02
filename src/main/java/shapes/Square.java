package shapes;

/**
 * Square class
 * 
 * @author Nicola McGowan
 */
public class Square extends Shape {

	private static final double SIDE = 7;

	private double side;

	/**
	 * Constructor
	 * 
	 * @param side
	 */
	public Square(double side) {
		super();
		this.setSide(side);
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Calculates area of a square
	 */
	@Override
	public double calculateArea() {
		final double area = SIDE * SIDE;
		return area;
	}

	/**
	 * Calculates perimeter of a square
	 */
	@Override
	public double calculatePerimeter() {
		final double perimeter = SIDE * 4;
		return perimeter;
	}
}
