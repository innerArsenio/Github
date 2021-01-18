public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new CircleShape(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getColor());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius());

        CircleShape shape1Circle = (CircleShape)shape1;
        System.out.println(shape1Circle.getArea());
        System.out.println(shape1Circle.getPerimeter());
        System.out.println(shape1Circle.getRadius());
        System.out.println(shape1Circle.getColor());
        System.out.println(shape1Circle.isFilled());

        //Shape1 shape11 = new Shape1(); нельзя инициировать абстрактный класс
        Shape shape11 = new RectangleShape(1,1, "red", false);
        System.out.println(shape11);
        System.out.println(shape11.getPerimeter());
        System.out.println(shape11.getColor());
        System.out.println(shape11.getArea());
        //System.out.println(shape11.getLength()); polymorphism

        RectangleShape shape1Rectangle = (RectangleShape) shape11;
        System.out.println(shape1Rectangle.getLength());

        Shape shape12 = new Square(1.1);
        System.out.println(shape12);
        System.out.println(shape12.getArea());
        System.out.println(shape12.getColor());
        //System.out.println(shape12.getSide());

        RectangleShape shape1Rectangle1 = (RectangleShape) shape12;
        // System.out.println(shape1Rectangle1.getSide());    rectangle doesn't have side method
        Square shape1Square = (Square) shape1Rectangle1;
        System.out.println(shape1Square.getSide());
    }
}
