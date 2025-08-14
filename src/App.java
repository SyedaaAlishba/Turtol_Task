import javax.swing.*;
import java.util.Scanner;
public class App {
    private  Turtle turtle;
    private Canvas canvas;
//    private Command[]commands;
    public void run(){
        canvas=new Canvas();
        turtle=new Turtle(canvas,new Point(100,100),0);
        Scanner sc = new Scanner(System.in);
        turtle.moveTo(new Point(200,100));
        System.out.println("Enter command F for forward and + means turn right and - means turn left");
        String inputCommand = sc.nextLine();
        char singleCommand;
        for (int i = 0; i < inputCommand.length(); i++) {
            singleCommand= inputCommand.charAt(i);
            if(singleCommand=='F'){
                turtle.forwardTo(100);
            } else if (singleCommand=='+') {
                turtle.turnRight(90);
            } else if (singleCommand=='-') {
                turtle.turnLeft(90);
            }
        }
















//
//        commands=new Command[]{
//            new SquareCommand(turtle,50),
//            new ZigZagCommand(turtle,50)
//        };
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose pattern: 1 = Square, 2 = ZigZag, 3 = Both");
//        int choice = sc.nextInt();
//        if (choice == 1) {
//            commands = new Command[]{ new SquareCommand(turtle, 50) };
//        } else if (choice == 2) {
//            commands = new Command[]{ new ZigZagCommand(turtle, 50) };
//        } else if (choice == 3) {
//            commands = new Command[]{
//                    new SquareCommand(turtle, 50),
//                    new ZigZagCommand(turtle, 50)
//            };
//        } else {
//            System.out.println("Invalid choice.");
//            return;
//        }
//        for (Command cmd : commands) {
//            cmd.execute();
//        }
        JFrame frame=new JFrame("Turtle");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.add(canvas);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
