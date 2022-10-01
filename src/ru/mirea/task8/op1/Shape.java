package ru.mirea.task8.op1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public abstract class Shape{
    protected int x;
    protected int y;
    protected int r, g, b;
    protected Color color;

    public abstract void setXY();

    public abstract void setColor();

    public abstract void RandomGenerator(Graphics g);


}
