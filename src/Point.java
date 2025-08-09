public class Point {
    private int x;
    private int y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void set(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

