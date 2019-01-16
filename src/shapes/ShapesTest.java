package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        //box1 instance
        Rectangle box1 = new Rectangle(4, 5);

        // Area of box1
        System.out.println("Length = " + box1.length);
        System.out.println("Width = " + box1.width);
        System.out.println();
        System.out.println("Area of Rectangle with length \"" + box1.length + "\" and width \"" + box1.width + "\" = " + box1.getArea()); //4*5=20

        // Perimeter of box1
        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter()); //(2*4) + (2*5) = 10
        System.out.println();
        //box2 instance
        System.out.println("+---+");
        Rectangle box2 = new Square(5);
        System.out.println("Side = " + ((Square) box2).getSide());

        System.out.println("Area of the square: " + box2.getArea());
        System.out.println("Perimeter of the square: " + box2.getPerimeter());

    }
}
