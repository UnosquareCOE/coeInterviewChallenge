package shapes;

public class Rectangle extends Shape {
  
  private double sideA;
  private double sideB;

  // Default Constructor
  public Rectangle() {

  }

  // Constructor with args
  public Rectangle(double sideA, double sideB) {
    this.setSideA(sideA);
    this.setSideB(sideB);
  }

  public double getSideA() {
    return sideA;
  }

  /**
   * Sets side A of rectangle. Only allows positive values
   * @param sideA
   * @throws IllegalArgumentException
   */
  public void setSideA(double sideA) throws IllegalArgumentException {
    if (sideA > 0) {
      this.sideA = sideA;
    } else {
      throw new IllegalArgumentException();
    }
  }


  public double getSideB() {
    return sideB;
  }

  /**
   * Sets side B of rectangle. Only allows positive values
   * @param sideB
   * @throws IllegalArgumentException
   */
  public void setSideB(double sideB) throws IllegalArgumentException {
    if (sideB > 0) {
      this.sideB = sideA;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * Calculates perimeter of rectangle
   */
  @Override
  public double calculatePerimeter() {
    return ((2 * sideA) + (2 * sideB));
  }

  /**
   * Calculates area of rectangle
   */
  @Override
  public double calculateArea() {
    return (sideA * sideB);
  }

  
}
