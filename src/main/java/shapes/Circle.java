package shapes;

public class Circle extends Shape {
    // code added below for challenge

    private double radius;

    // default constructor is unnecessary, so I've left it commented out
    // as we only want argument values being passed in
    //public Circle() {}

    // constructor with args, 'radius' value to be passed in
    public Circle(double radius) {
        super();
        this.setRadius(radius);
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    /**
     * helper method to set the radius, which only accepts a value greater than 0
     * @param radius as a double value
     * @throws IllegalArgumentException if value is less than or equal to 0
     */
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius value must be greater than 0");
        } else {
            this.radius = radius;
        }
    }

    /**
     * method to calculate the area of a circle
     * @return the area figure as a double
     */
    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    /**
     * method to calculate the perimeter of a circle
     * @return the perimeter figure as a double
     */
    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

} // end of class