/* Author: Thomas Burke
An absolute nightmare trying to get Gradle running in Eclipse.
Eventually worked flawlessly in IntelliJ!
Also fine in Terminal.
 */

package shapes;

public class Circle extends Shape {
	// Add Code Here

	private double radius;

// CONSTRUCTOR based on Test input
	// Public so no getters/setters
	public Circle(double radius) {
		this.radius = radius;
	}

// Override parent Shape class
	@Override
	public double calculateArea() {
		return (radius * radius * Math.PI);

	}

// Override Parent Shape Class
	@Override
	public double calculatePerimeter() {
		double perimeter = radius * 2 * Math.PI;
		System.out.println("Perimeter: " + perimeter); //testing
		return perimeter;
	}
}