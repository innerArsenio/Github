public class Square extends RectangleShape{

    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
    }
    public void setWidth(double side){
        this.setSide(side);
    }
    public void setLength(double side){
        this.setSide(side);
    }
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
