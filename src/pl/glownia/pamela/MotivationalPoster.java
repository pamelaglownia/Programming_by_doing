package pl.glownia.pamela;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MotivationalPoster extends Canvas {
    Image einstein;

    public MotivationalPoster() throws IOException {
        einstein = ImageIO.read(new File("AlbertEinstein.jpg"));
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(10, 10, 780, 580);
        g.drawImage(einstein, 231, 90, this);
        g.setColor(Color.white);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        g.drawString("INSANITY", 300, 430);
        g.setFont(new Font("Century Gothic", Font.ITALIC, 13));
        g.drawString("doing the same things, but expecting different results.", 231, 450);
    }

    public static void main(String[] args) throws Exception {
        Canvas canvas = new MotivationalPoster();
        JFrame frame = new JFrame("Motivational poster");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
        canvas.setBackground(Color.black);
    }
}