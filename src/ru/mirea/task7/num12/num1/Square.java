package ru.mirea.task7.num12.num1;

public class Square extends Rectangle{
    protected double side;
    public Square() {}

    public Square(double side) {
        this.width = side;
        this.height = side;
    }
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.height = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.width = side;
        this.height = side;
    }
}
