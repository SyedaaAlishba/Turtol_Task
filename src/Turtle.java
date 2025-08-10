public class Turtle extends Pen{
    private Point point;
    float angle;
    Turtle(Point p, float angle){
        this.point=p;
        this.angle=angle;
    }
    public void turnLeft(float angle){
        System.out.println("Turning left to "+angle);
    }
    public void turnRight(float angle){
        System.out.println("Turning right to "+angle);
    }
    public void forwardTo(Point endPoint){
        Point startCopy= new Point(this.position.getX(),this.position.getY());
        Point endCopy=new Point(endPoint.getX(), endPoint.getY());
    }

}
