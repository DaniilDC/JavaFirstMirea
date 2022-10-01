package ru.mirea.task8.op1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Circle extends Shape{
    public int ColorGenerator(){
        Random generator = new Random();
        return generator.nextInt(1, 256);
    }

    public int NumberGenerator(){
        Random generator = new Random();
        return generator.nextInt(0, 500);
    }

    @Override
    public void setXY() {
        this.x = NumberGenerator();
        this.y = NumberGenerator();
    }

    @Override
    public void setColor() {
        this.r = ColorGenerator();
        this.g = ColorGenerator();
        this.b = ColorGenerator();
        this.color = new Color(r, g, b);
    }

    @Override
    public void RandomGenerator(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 15, 15);
    }
}