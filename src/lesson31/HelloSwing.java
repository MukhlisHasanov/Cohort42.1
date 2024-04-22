package lesson31;

import javax.swing.*;
import java.awt.*;

public class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing();
    }

    public HelloSwing() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JButton b1 = new JButton("first");
        JButton b2 = new JButton("Second");

        Panel btnPanel = new Panel();


        setVisible(true);
    }
}
