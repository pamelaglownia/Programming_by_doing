package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class SmilingFace extends Canvas {

    public void paint(Graphics g) {
        Color myYellow = new Color(238, 231, 112);
        g.setColor(myYellow);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.black);
        g.fillOval(160, 175, 20, 20);
        g.setColor(Color.black);
        g.fillOval(220, 175, 20, 20);
        g.setColor(Color.red);
        g.drawArc(170, 220, 60, 30, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiling face");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SmilingFace smilingFace = new SmilingFace();
        frame.add(smilingFace);
        frame.setVisible(true);
    }
}
