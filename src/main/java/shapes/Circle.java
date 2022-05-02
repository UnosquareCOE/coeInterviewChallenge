package shapes;

public class Circle extends Shape {
  // Add Code Here
  private double radius = 9.5;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    double area = Math.PI * Math.pow(radius, 2);
    return area;
  }

  public double calculatePerimeter()  {
    double perimeter = 2 * Math.PI * radius;
    return perimeter;
  }

  
}
