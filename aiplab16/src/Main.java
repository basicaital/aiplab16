import ex.Drawing;
import task.Task;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Task task = new Task();
        frame.setSize(500,500);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
