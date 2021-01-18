public class MovableRectangle implements Movable {
    private MovablePointAnother t1;
    private MovablePointAnother t2;
    
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        t1 = new MovablePointAnother(x1,y1,xSpeed, ySpeed);
        t2 = new MovablePointAnother(x2,y2,xSpeed,ySpeed);

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }

    @Override
    public void moveUp() {
        t1.y-=t1.ySpeed;
        t2.y-= t1.ySpeed;
    }

    @Override
    public void moveDown() {
        t1.y+=t1.ySpeed;
        t2.y+= t1.ySpeed;
    }

    @Override
    public void moveLeft() {
        t1.x-=t1.xSpeed;
        t2.x-= t1.xSpeed;
    }

    @Override
    public void moveRight() {
        t1.x+=t1.xSpeed;
        t2.x+= t1.xSpeed;
    }
}
