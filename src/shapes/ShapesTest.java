package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Quadrilateral box1 = new Rectangle(5,4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Quadrilateral box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle(5, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        }
    }

    //When we call getLength() on myShape, it has to cast it to a type that has that
    //included in it's interface

