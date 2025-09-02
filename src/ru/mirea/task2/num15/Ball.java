package ru.mirea.task2.num15;

public class Ball {
    String type;
    double weight;
    String color;

    public Ball(String type, double weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "тип: '" + type + '\'' +
                ", вес: " + weight +
                ", цвет: '" + color + '\'' +
                '}';
    }
}
