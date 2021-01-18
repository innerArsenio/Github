public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;


    public MyRectangle(int x1, int y1, int x2, int y2){
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);

    }

    public MyRectangle(MyPoint v1, MyPoint v2){
        this.v1=v1;
        this.v2=v2;
    }

    public String toString() {
        return "MyRectangle[v1="+v1.toString()+",v2="+v2.toString()+"]";
    }

    public double getPerimeter(){
        return  2*Math.abs(v1.getX()-v2.getX())+2*Math.abs(v1.getY()-v2.getY());
    }
}
