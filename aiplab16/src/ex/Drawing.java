package ex;

import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics graphics){
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(100,100,200,200);
    }
}
