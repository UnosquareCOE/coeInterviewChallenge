package shapes;

public class Rectangle extends Shape {
	// Add Code Here
	// instance vars
	private double width;
	private double height;

	// default constructor
	public Rectangle() {

	}

	// constructor with args
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * @return - width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * set the width
	 * 
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return - height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * set the height
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Calculates the area of the rectangle
	 * 
	 * @return - area
	 */
	@Override
	public double calculateArea() {
		double area = width * height;
		return area;
	}

	/**
	 * Calculates the perimeter of the rectangle
	 * 
	 * @return - perimeter
	 */
	@Override
	public double calculatePerimeter() {
		double perimeter = (width * 2) + (height * 2);
		return perimeter;
	}

}