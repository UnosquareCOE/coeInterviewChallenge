package shapes;

public class Square extends Shape {
  // Add Code Here
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double calculateArea() {
    double area = side * side;
    return area;
  }

  public double calculatePerimeter()  {
    double perimeter = 4 * side;
    return perimeter;
  }

}
