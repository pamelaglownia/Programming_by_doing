package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class ClockFace extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(150, 150, 300, 300);
        g.setColor(Color.blue);
        g.drawOval(120, 120, 360, 360);
        g.fillOval(295, 295, 10, 10);
        g.setColor(Color.black);
        g.drawOval(150, 150, 300, 300);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("12", 288, 184);
        g.drawString("6", 294, 440);
        g.drawString("3", 428, 306);
        g.drawString("9", 160, 306);
        g.setColor(Color.blue);
        g.drawLine(300, 305, 300, 190);
        g.drawLine(300, 300, 370, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock face");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ClockFace clock = new ClockFace();
        frame.add(clock);
        frame.setVisible(true);
    }
}
