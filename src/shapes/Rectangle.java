package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    // Rectangle Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }// End of Rectangle Constructor

    //getArea method
    public int getArea(){
        int area = this.length * this.width;
        return area;
    } // End of getArea()

    //getPerimeter method
    public int getPerimeter(){
        int perimeter = (2 * this.length) + (2 * this.width);
        return perimeter;
    }


} // End of Class
