package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class Circle extends Canvas {
    public void paint(Graphics g) {
        Color myGreen = new Color(24, 92, 32);
        g.setColor(myGreen);
        g.fillOval(250, 150, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first graphic");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle circle = new Circle();
        frame.add(circle);
        frame.setVisible(true);
    }
}
