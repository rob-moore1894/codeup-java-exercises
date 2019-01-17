package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(4);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        Measurable rectangle = new Rectangle(1, 17);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter " + rectangle.getPerimeter());


    }
}
