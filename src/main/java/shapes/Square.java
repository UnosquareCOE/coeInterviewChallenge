package shapes;

public class Square extends Shape {
	
	private double side;
	
	/**
	 * 
	 */
	public Square() {
	}
	
	/**
	 * 
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return (this.side) * (this.side);
	}

	@Override
	public double calculatePerimeter() {
		return (4 * (this.side));
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
  
}
