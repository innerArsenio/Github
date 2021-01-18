public class LineSub extends AnotherPoint{
    AnotherPoint end;

    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        this.end = new AnotherPoint(endX,endY);
    }
    public LineSub(AnotherPoint begin, AnotherPoint end){
        super(begin.getX(),begin.getY());
        this.end=end;
    }
    public String toString(){
        return "LineSub[begin=("+super.toString()+"), end=("+end.toString()+")]";
    }
    public AnotherPoint getBegin(){
        return new AnotherPoint(getX(), getY());
    }
    public void setBegin(AnotherPoint begin){
        begin = new AnotherPoint(getX(), getY());
    }
    public AnotherPoint getEnd(){
        return end;
    }
    public void setEnd(AnotherPoint end){
        this.end=end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        super.setXY(x,y);
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }
    public int getLength(){
        int diffY = getBeginY()-getEndY();
        int diffX = getBeginX()-getEndX();
        return (int) Math.sqrt((diffY*diffY)+(diffX*diffX));
    }
    public double getGradient(){
        int diffY = getBeginY()-getEndY();
        int diffX = getBeginX()-getEndX();
        return Math.atan2(diffY,diffX);
    }
}
