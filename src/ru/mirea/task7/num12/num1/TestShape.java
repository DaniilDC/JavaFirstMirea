package ru.mirea.task7.num12.num1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.0);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("зелёный", true, 1.2, 3.0);
        System.out.println(rectangle.toString());

        Square square = new Square();
        square.setSide(2.0);
        System.out.println(square.toString());

    }
}
