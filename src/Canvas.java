import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {

    private List<Line> cvs_Line= new ArrayList<>();
    public void addLine(Point p1,Point p2){
        Point startCopy =new Point(p1) ;
        Point endCopy =new Point(p2) ;
        cvs_Line.add(new Line(startCopy, endCopy));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : cvs_Line) {
            g.drawLine((int)line.start.getX(),(int) line.start.getY(),(int) line.end.getX(),(int) line.end.getY());
        }
    }
}
