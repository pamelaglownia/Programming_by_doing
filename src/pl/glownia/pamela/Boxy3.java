package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class Boxy3 extends Canvas {
    public void paint(Graphics g) {
        drawBox(g, Color.RED, 100, 120, 100, 30);
        drawBox(g, Color.CYAN, 275, 315, 150, 150);
        drawBox(g, Color.YELLOW, 700, 290, 30, 50);
        drawBox(g, Color.ORANGE, 470, 220, 70, 150);
        drawBox( g, Color.LIGHT_GRAY, 310, 210,100,100 );
        drawBox( g, Color.MAGENTA, 620, 460, 50,60 );
        drawBox( g, Color.GRAY, 400, 100, 160,100 );
        drawBox( g, Color.PINK, 170, 170, 70,300 );
    }

    public void drawBox(Graphics g, Color color, int x, int y, int width, int high) {
        g.setColor(color);
        g.fillRect(x, y, width, high);
        g.setColor(Color.WHITE);
        g.fillRect(x+10, y+10, width-20,high-20);
    }

    public static void main(String[] args) {
        Canvas canvas = new Boxy3();
        JFrame frame = new JFrame("Boxy3");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}