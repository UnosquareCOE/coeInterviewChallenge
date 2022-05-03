package shapes;

public class Square extends Shape {
    // code added below for challenge

    private double side;

    // default constructor is unnecessary, so I've left it commented out
    // as we only want argument values being passed in
    //public Square() {}

    // constructor with args, 'side' value to be passed in
    public Square(double side) {
        super();
        this.setSide(side);
    }

    // getter for side
    public double getSide() {
        return side;
    }

    /**
     * helper method to set the side value, which only accepts a value greater than 0
     * @param side as a double value
     * @throws IllegalArgumentException if value is less than or equal to 0
     */
    public void setSide(double side) throws IllegalArgumentException {
        if (side <= 0) {
            throw new IllegalArgumentException("Side value must be greater than 0");
        } else {
            this.side = side;
        }
    }

    /**
     * method to calculate the area of a square
     * @return the area figure as a double
     */
    @Override
    public double calculateArea() {
        return (Math.pow(side, 2));
    }

    /**
     * method to calculate the perimeter of a square
     * @return the perimeter figure as a double
     */
    @Override
    public double calculatePerimeter() {
        return (side * 4);
    }

} // end of class
