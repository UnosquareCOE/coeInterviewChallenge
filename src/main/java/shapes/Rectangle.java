package shapes;

public class Rectangle extends Shape {
  // Add Code Here

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    double area = width * height;
    return area;
  }

  public double calculatePerimeter()  {
    double perimeter = 2 * (height + width);
    return perimeter;
  }

}
