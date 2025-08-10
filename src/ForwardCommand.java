public class ForwardCommand  implements Command{
    private Turtle turtle;
    private float distance;
    ForwardCommand(Turtle turtle,float distance){
        this.turtle=turtle;
        this.distance=distance;
    }
    public void execute(){
        turtle.forwardTo(distance);
    }
}
