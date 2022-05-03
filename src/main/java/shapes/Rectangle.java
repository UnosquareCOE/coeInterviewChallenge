package shapes;

public class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    setLength(length);
    setWidth(width);

  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setLength(double length) {
    if (length <= 0) {
      throw new IllegalArgumentException("Rectangle length must be greater than 0!");
    } else {
      this.length = length;
    }
  }

  public void setWidth(double width) {
    if (width <= 0) {
      throw new IllegalArgumentException("Rectangle width must be greater than 0!");
    } else {
      this.width = width;
    }
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return (2 * length) + (2 * width);
  }

}
