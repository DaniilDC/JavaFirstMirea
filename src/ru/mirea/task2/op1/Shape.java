package ru.mirea.task2.op1;

public class Shape {
    public String type;
    public int height;
    public int width;
    public Shape(String type, int height, int width)
    {
        this.type = type;
        this.height = height;
        this.width = width;
    }
    public String toString() {
        return "Shape {" + "type = " + type + ", height = " + height + ", width = " + width + '}';
    }
}

