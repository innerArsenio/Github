public class Line {
    // A line composes of two points (as instance variables)
    private AnotherPoint begin; // beginning point
    private AnotherPoint end; // ending point
    // Constructors
    public Line (AnotherPoint begin, AnotherPoint end) { // caller to construct the Points
        this.begin = begin;
        this.end=end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new AnotherPoint(beginX, beginY); // construct the Points here
        end=new AnotherPoint(endX, endY);
    }
// Public methods

    public String toString() {
        return begin.toString()+";"+end.toString();
    }
    public AnotherPoint getBegin() {
        return begin;
    }
    public AnotherPoint getEnd() {
        return end;
    }
    public void setBegin(AnotherPoint begin) {
        this.begin=begin;
    }
    public void setEnd(AnotherPoint end) {
        this.end=end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        end.setXY(endX,endY);
    }

    public double getLength() {
        return Math.sqrt( ( getBeginX()-getEndX() )*( getBeginX()-getEndX() ) + ( getBeginY()-getEndY() )*( getBeginY()-getEndY() )        );
    } // Length of the line

    public double getGradient() {
        return Math.atan2(getBeginY()-getEndY(), getBeginX()-getEndX());
    }

}
