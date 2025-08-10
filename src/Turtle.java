public class Turtle extends Pen{

    float angle;

    public Turtle(Canvas cvs, Point p, float angle) {
        super(cvs); // Call Pen's constructor
        this.angle = angle;
        this.position = new Point(p); // initialize inherited position
    }

    public void turnLeft(float angle){
        System.out.println("Turning left to "+angle);
        this.angle-=angle;
    }
    public void turnRight(float angle){
        System.out.println("Turning right to "+angle);
        this.angle+=angle;
    }
    public void forwardTo(float distance){
        float rad = (float) Math.toRadians(angle);
        float newX = position.getX() + (float) Math.cos(rad) * distance;
        float newY = position.getY() + (float) Math.sin(rad) * distance;

        Point endPoint = new Point(newX, newY);
        lineTo(endPoint);
    }

}
