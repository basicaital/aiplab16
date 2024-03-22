package ex;

import javax.swing.*;
import java.awt.*;

public class DrawingSecond extends JComponent {
    @Override
    public void paintComponent(Graphics graphics){
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(100,100,200,200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        DrawingSecond drawingSecond = new DrawingSecond();
        frame.setSize(500,500);
        frame.add(drawingSecond);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
