package shapes;

public class Square extends Rectangle {

   protected int side;

    public Square(int length, int width) {
        super(length, width);
    }// End of Square inherited constructor

    public Square(int side){
        super(side, side);
        this.side = side;
    }// End of Square-specific constructor

    public int getSide() {
        return side;
    } // End of getter for side

    public void setSide(int side) {
        this.side = side;
    }// End of setter for side

    //getArea method
    public int getArea(){
        int area = (int) Math.pow(this.side, 2);
        return area;
    } // End of getArea()

    //getPerimeter method
    public int getPerimeter(){
        int perimeter = this.side * 4;
        return perimeter;
    }

}// End of Square Class
