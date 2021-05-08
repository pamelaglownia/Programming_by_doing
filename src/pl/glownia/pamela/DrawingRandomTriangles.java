package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawingRandomTriangles extends Canvas {

    public void paint(Graphics g){
        Random random = new Random();
        Polygon randomTriangle = new Polygon();

        for(int count = 0; count <=500; count++){
            int red = random.nextInt(255);
            int blue = random.nextInt(255);
            int green = random.nextInt(255);
            int x = random.nextInt(550);
            int y= random.nextInt(300);
            randomTriangle.addPoint(x,y);
            randomTriangle.addPoint(x, y+50);
            randomTriangle.addPoint(x+50, y+50);
            Color randomColor = new Color(red,green,blue);
            g.setColor(randomColor);
            g.fillPolygon(randomTriangle);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Triangles");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new DrawingRandomTriangles());
        frame.setVisible(true);
    }
}