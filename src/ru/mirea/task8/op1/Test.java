package ru.mirea.task8.op1;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Random;

public class Test extends JPanel {
    ArrayList <Shape> shapes = new ArrayList<Shape>();
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Shapes");
        frame.add(new Test());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public Test(){
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(500, 500));
        Random random = new Random();
        for (int j = 0; j < 20; j++)
        {
            int number = random.nextInt(0, 2);
            if (number == 0)
            {
                addCircle();
            }
            else
            {
                addRectangle();
            }
        }
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        setDoubleBuffered(true);
        for (Shape shape : shapes)
        {
            shape.RandomGenerator(g);
        }
    }
    public void addCircle()
    {
        Circle circle = new Circle();
        circle.setXY();
        circle.setColor();
        shapes.add(circle);
    }
    public void addRectangle()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setXY();
        rectangle.setColor();
        shapes.add(rectangle);
    }
}

