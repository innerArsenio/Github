public class TestLineSubtestLineSub {
    public static void main(String[] args) {
        AnotherPoint p1 = new AnotherPoint(1,2);
        AnotherPoint p2 = new AnotherPoint(3,4);
        LineSub line = new LineSub(10, 20, 30, 40);
        System.out.println(line);
        line.setBegin(p1);
        line.setEnd(p2);
        System.out.println(line.getLength());
        System.out.println(line.getBegin());
        System.out.println(line.getBeginX());
        System.out.println(line.getEnd());

    }
}
