package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }// End of Constructor

    public double getLength() {
        return length;
    } // End of getter for length

    public double getWidth() {
        return width;
    } // End of getter for width

    public abstract void setLength(double length); // End of setter for length


    public abstract void setWidth(double width); // End of setter for width

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }
} // End of Class
