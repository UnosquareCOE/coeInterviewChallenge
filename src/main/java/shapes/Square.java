package shapes;

public class Square extends Shape {

  private double side;

  public Square(double side) {
    setSide(side);
  }

  public void setSide(double side) {
    if (side <= 0) {
      throw new IllegalArgumentException("Sorry, side must be greater than 0!");
    } else {
      this.side = side;
    }
  }

  public double getSide() {
    return this.side;
  }

  public double calculateArea() {
    return side * side;
  }

  public double calculatePerimeter() {
    return side * 4;
  }

}
