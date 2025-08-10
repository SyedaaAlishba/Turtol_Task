public class Pen {
    public Point position;

    public void moveTo(Point z){
        System.out.println("Pen moved to "+z);
        this.position = new Point(z); //one opt
    }


    public void setPosition(Point p){
        this.position = new Point(p); // deep copy
    }


}
