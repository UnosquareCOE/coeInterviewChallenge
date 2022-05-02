package shapes;

/**
 * Rectangle class
 * 
 * @author Nicola McGowan
 */
public class Rectangle extends Shape {
	private static final double WIDTH = 5;
	private static final double HEIGHT = 8;

	private double width;
	private double height;

	/**
	 * Constructor
	 * 
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Calculates area of a rectangle
	 */
	@Override
	public double calculateArea() {
		final double area = WIDTH * HEIGHT;
		return area;
	}

	/**
	 * Calculates perimeter of a rectangle
	 */
	@Override
	public double calculatePerimeter() {
		final double perimeter = (2 * WIDTH) + (2 * HEIGHT);
		return perimeter;
	}
}
