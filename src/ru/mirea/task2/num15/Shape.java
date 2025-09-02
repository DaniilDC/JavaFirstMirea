package ru.mirea.task2.num15;

public class Shape {
    String type;
    double height;
    double width;

    public Shape(String type, double height, double width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + type + "\n" +
                "Высота: " + height + "\n" +
                "Ширина: " + width;
    }
}
