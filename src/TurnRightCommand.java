public class TurnRightCommand implements Command {
    private Turtle turtle;
    private float angle;

    TurnRightCommand(Turtle turtle, float angle) {
        this.turtle = turtle;
        this.angle = angle;
    }

    public void execute() {
        turtle.turnRight(angle);
    }

}
