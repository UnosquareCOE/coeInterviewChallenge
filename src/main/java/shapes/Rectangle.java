package shapes;

public class Rectangle extends Shape {
// code added below for challenge

    private double height;
    private double width;

    // default constructor is unnecessary, so I've left it commented out
    // as we only want argument values being passed in
    //public Rectangle() {}

    // constructor with args, 'height' and 'width' values to be passed in
    public Rectangle(double height, double width) {
        super();
        this.setHeight(height);
        this.setWidth(width);
    }

    // getter for height
    public double getHeight() {
        return height;
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    /**
     * helper method to set the height, which only accepts a value greater than 0
     * @param height as a double value
     * @throws IllegalArgumentException if value is less than or equal to 0
     */
    public void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("Height value must be greater than 0");
        } else {
            this.height = height;
        }
    }

    /**
     * helper method to set the width, which only accepts a value greater than 0
     * @param width as a double value
     * @throws IllegalArgumentException if value is less than or equal to 0
     */
    public void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException("Width value must be greater than 0");
        } else {
            this.width = width;
        }
    }

    /**
     * method to calculate the area of a rectangle
     * @return area figure as a double
     */
    @Override
    public double calculateArea() {
        return (height * width);
    }

    /**
     * method to calculate the perimeter of a rectangle
     * @return the perimeter figure as a double
     */
    @Override
    public double calculatePerimeter() {
        return (2 * (height + width));
    }

} // end of class
