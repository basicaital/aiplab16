package task;

import ex.Drawing;

import javax.swing.*;
import java.awt.*;

public class Task extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Canvas canvas = new Task();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paint(Graphics g){

        //Плоскость
        g.setColor(Color.BLACK);
        g.drawLine(25, 300, 450, 300);

        //Каркас дома
        g.drawRect(50, 150, 150,150);

        //Скаты крыш
        g.drawLine(25,175, 125,75);
        g.drawLine(125,75,225,175);

        //Дымовая труба
        g.drawLine(150,100,150,75);
        g.drawLine(150,75,175,75);
        g.drawLine(175,125,175,75);

        //Окно
        g.drawRect(75,175, 50,50);
        //Ствол дерева
        g.drawLine(340,250,340,300);
        g.drawLine(360,250,360,300);

        //Ветки дерева
        g.setColor(Color.GREEN);
        g.fillOval(275, 50, 150, 200);

        //Человек у дома
        g.setColor(Color.BLACK);
        g.drawLine(250,265,250,225);
        g.drawOval(240,200,30,25);
        g.drawLine(250,265,230,300);
        g.drawLine(250,265,260,300);
        g.drawLine(250,235,220,250);
        g.drawLine(250,235,280,250);


    }
}
