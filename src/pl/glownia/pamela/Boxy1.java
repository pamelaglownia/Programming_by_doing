package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class Boxy1 extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(550, 200, 100, 100);
        g.setColor(Color.WHITE);
        g.fillRect(557, 207, 85, 85);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.WHITE);
        g.fillRect(110, 110, 80, 80);
        g.setColor(Color.CYAN);
        g.fillRect(400, 270, 100, 100);
        g.setColor(Color.WHITE);
        g.fillRect(415, 285, 70, 70);
        g.setColor(Color.MAGENTA);
        g.fillRect(670, 450, 100, 100);
        g.setColor(Color.WHITE);
        g.fillRect(675, 455, 90, 90);
    }

    public static void main(String[] args) {
        Canvas canvas = new Boxy1();
        JFrame frame = new JFrame("Box 1");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}