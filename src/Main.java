public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle(4);
        System.out.println("circle Area "+circle.getArea());

        Rectangle rectangle=new Rectangle(10,11);
        System.out.println("Rectangle Area "+rectangle.getArea());
        System.out.println("Rectangle Perimeter "+rectangle.getPerimeter());

        Square square=new Square(10);
        System.out.println("Square Side :"+square.getSide());
        System.out.println("Square Area :"+square.getArea());
        System.out.println("Square Perimeter :"+square.getPerimeter());
    }
}