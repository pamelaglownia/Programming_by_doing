package pl.glownia.pamela;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ForestAndTrees extends Canvas {
    public void paint(Graphics g) {
        // draws a few single trees for testing
        drawTree(g, 70, 530);
        drawTree(g, 930, 570);
        drawTree(g, 570, 280);
        drawTree(g, 740, 400);

        // draws the first forest
        g.drawRect(20, 10, 450, 450);
        drawForest(g, 20, 10, 450, 450);

        // draws the second forest
        g.drawRect(550, 20, 400, 250);
        drawForest(g, 550, 20, 400, 250);

        // draws the third forest
        g.drawRect(200, 530, 710, 160);
        // * write code here to call drawForest() with the same dimensions as the rectangle above
        drawForest(g, 200, 530, 710, 160);
    }

    public void drawTree(Graphics g, int x, int y) {
        g.setColor(new Color(134, 83, 0));    // defines a brownish color

        // * write code here to draw the trunk using fillRect
        g.fillRect(x + 17, y + 50, 16, 50);
        g.setColor(Color.BLACK);
        g.drawRect(x + 17, y + 50, 16, 50);
        // * write code here to create and draw a polygon for branches
        Polygon branches = new Polygon();
        branches.addPoint(x, y + 75);
        branches.addPoint(x + 25, y);
        branches.addPoint(x + 50, y + 75);
        g.setColor(Color.GREEN);
        g.fillPolygon(branches);
        g.setColor(Color.BLACK);
        g.drawPolygon(branches);
    }

    public void drawForest(Graphics g, int x, int y, int w, int h) {
        // creates a box to demonstrate the forest's boundary
        g.setColor(Color.black);
        g.drawRect(x, y, w, h);
        // * write code here to make a loop that repeats 100 times or so
        for (int count = 0; count <= 100; count++) {
            // * write code here to give 'a' a random value from [0 , w-50],  (assuming your tree is 50px wide)
            // * write code here to give 'b' a random value from [0 , h-100], (assuming your tree is 100px tall)
            Random random = new Random();
            int a = random.nextInt(w - 50);
            int b = random.nextInt(h - 100);
            drawTree(g, x + a, y + b);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ForestAndTrees");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ForestAndTrees());
        frame.setVisible(true);
    }
}