package shapes;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    setRadius(radius);
  }

  public void setRadius(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be greater than 0!");
    } else {
      this.radius = radius;
    }
  }

  public double getRadius() {
    return this.radius;
  }

  public double calculateArea() {
    return radius * radius * Math.PI;
  }

  public double calculatePerimeter() {
    return 2 * radius * Math.PI;
  }

}
