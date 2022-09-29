package ru.mirea.task7.op1;

public class Square extends Rectangle{
    protected double side;

    public Square(){}
    public Square(double side)
    {
        this.side = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(double side) {
        return Math.pow(side, 2);
    }

    public double getPerimeter(double side) {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Rectangle {side = " + side + ", Area = " + getArea()
                + ", Perimeter = " + getPerimeter() + "}";
    }
}
