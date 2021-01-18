public class TestMyCircle {
    public static void main(String[] args){

        // Test program to test all constructors and public methods
        MyCircle c1 = new MyCircle(1,2,3); // Test constructor
        System.out.println(c1); // Test toString()
        c1.setCenterX(3); // Test setters
        c1.setCenterY(4);
        c1.setRadius(3);
        System.out.println("center x: " + c1.getCenterX()); // Test getters
        System.out.println("center y: " + c1.getCenterY()); // Test getters
        System.out.println("radius: " + c1.getRadius()); // Test getters
        System.out.println("area: " + c1.getArea()); // Test getters
        System.out.println("center: " + c1.getCenter()); // Test getters
        System.out.println("circumference: " + c1.getCircumference()); // Test getters
        System.out.println("circle: " + c1.toString()); // Test getters
        MyCircle c2 = new MyCircle(0,0,3); // Test constructor
        System.out.println("distance between c1 and c2: " + c1.distance(c2)); // Test getters

    }



}
