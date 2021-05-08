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
            int x1 = random.nextInt(600);
            int x2 = random.nextInt(600);
            int x3 = random.nextInt(600);
            int y1= random.nextInt(400);
            int y2= random.nextInt(400);
            int y3= random.nextInt(400);
            randomTriangle.addPoint(x1,y1);
            randomTriangle.addPoint(x2,y2);
            randomTriangle.addPoint(x3,y3);
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