public class TestMyTriangle {
    public static void main(String[] args){

        // Test program to test all constructors and public methods
        MyTriangle m1 = new MyTriangle(1,2,3,4,5,6); // Test constructor
        System.out.println("perimeter: " + m1.getPerimeter());
        System.out.println("type: " + m1.getType());
        System.out.println("triangle: " + m1.toString());

    }
}
