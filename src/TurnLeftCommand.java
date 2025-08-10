public class TurnLeftCommand {
    private Turtle turtle;
    private float angle;

    TurnLeftCommand(Turtle turtle, float angle) {
        this.turtle = turtle;
        this.angle = angle;
    }

    public void execute() {
        turtle.turnLeft(angle);
    }
}
