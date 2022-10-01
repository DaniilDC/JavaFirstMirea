package ru.mirea.task8.op1;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape{

    public int ColorGenerator(){
        Random generator = new Random();
        return generator.nextInt(1, 255);
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
        g.fillRect(x, y, 10, 15);
    }
}
