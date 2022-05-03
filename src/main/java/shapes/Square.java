package shapes;

public class Square extends Shape {
	// Add Code Here

	public double side;

	// CONSTRUCTOR based on Test class
	// Public so no getters/setters
	public Square(double side) {
		this.side = side;
	}

	//OVERRIDE PARENT SHAPE CLASS
	@Override
	public double calculateArea() {
		return (side * side);
	}

	@Override
	public double calculatePerimeter() {
//		double perimeter = side * 4;
		return (side * 4);
	}
}
