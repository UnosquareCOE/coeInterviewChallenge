package shapes;

public class Square extends Shape {
  
  private double sideLength;

  // Default Constructor
  public Square() {

  }
  
  // Constructor with Args
  public Square(double sideLength) {
    this.setSideLength(sideLength);
  }


  // Getters and Setters
  public double getSideLength() {
    return sideLength;
  }

  /**
   * Sets side length. Only allows positive values
   * 
   * @param sideLength
   * @throws IllegalArgumentException
   */
  public void setSideLength(double sideLength) throws IllegalArgumentException {

    if (sideLength > 0) {
      this.sideLength = sideLength;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
   * Calculates area of square
   */
  @Override
  public double calculateArea() {
    return (Math.pow(sideLength, 2));
  }

  /**
   * Calculates perimeter of square
   */
  @Override
  public double calculatePerimeter() {
    return (this.sideLength * 4);
  }
    
    
}
