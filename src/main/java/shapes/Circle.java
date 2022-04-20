package shapes;

public class Circle extends Shape {

  private double radius;

  // Default Constructor
  public Circle() {

  }

  // Constructor with args
  public Circle(double radius) {
    this.setRadius(radius);
  }

  public double getRadius() {
    return radius;
  }

  /**
   * Sets radius of circle. Only allows positive values
   * 
   * @param radius
   * @throws IllegalArgumentException
   */
  public void setRadius(double radius) throws IllegalArgumentException {

    if (radius > 0) {
      this.radius = radius;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * Calculates perimeter of circle
   */
  @Override
  public double calculatePerimeter() {
    return (2 * Math.PI * radius);
  }

  /**
   * Calculates area of circle
   */
  @Override
  public double calculateArea() {
    return (Math.PI * (Math.pow(radius, 2)));
  }
}
