package shapes;

public class Square extends Shape {

	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double calculateArea() {
		return side * side;
	}

	public double calculatePerimeter() {
		return side * 4;
	}

}
