public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        AnotherPoint p1 = new AnotherPoint(1,2);
        AnotherPoint p2 = new AnotherPoint(5,6);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }
}
