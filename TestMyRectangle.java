public class TestMyRectangle {
    public static void main(String[] args){

        // Test program to test all constructors and public methods
        MyRectangle m1 = new MyRectangle(1,2,3,4); // Test constructor
        System.out.println("perimeter: " + m1.getPerimeter());
        System.out.println("rectangle: " + m1.toString());

    }
}
