package ru.mirea.task7.num12.num1;

public class Circle extends Shape{
    protected double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Площадь круга с радиусом " + radius + " равна " + getArea() + "\n"
                + "Длина окружности равна " + getPerimeter();
    }
}
