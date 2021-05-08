package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;

public class DrawingABoringTriangle extends Canvas {
    public void paint(Graphics g) {
        Polygon triangle = new Polygon();
        triangle.addPoint(200, 100);
        triangle.addPoint(100, 300);
        triangle.addPoint(300, 300);

        Color purple = new Color(76, 9, 106);
        g.setColor(purple);
        g.fillPolygon(triangle);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new DrawingABoringTriangle());
        frame.setVisible(true);
    }
}