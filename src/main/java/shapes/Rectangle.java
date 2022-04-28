package shapes;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	/**
	 * creates a rectangle in the system
	 */
	public Rectangle() {
	}
	
	/**
	 * creates a rectangle in the system with the width and height set
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	

	@Override
	public double calculateArea() {
		return (this.width) * (this.height);
	}

	@Override
	public double calculatePerimeter() {
		return (2 * (this.width)) + (2 * (this.height));
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
  
}
