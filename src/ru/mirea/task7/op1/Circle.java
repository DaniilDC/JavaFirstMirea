package ru.mirea.task7.op1;


import ru.mirea.task3.opt1.CircleTest;

public class Circle extends Shape{

    protected double radius;

    public Circle() {}
    public Circle(double radius) {this.radius = radius;}
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {this.radius = radius;}

    public double getRadius() {return radius;}

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle {radius = " + radius + ", Area = " + getArea() + ", Perimeter = " + getPerimeter()
                + "}";
    }
}
