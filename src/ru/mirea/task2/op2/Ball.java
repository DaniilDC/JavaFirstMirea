package ru.mirea.task2.op2;

public class Ball {
    public String type;
    public int weight;
    public String color;
    public Ball(String type, int weight, String color)
    {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }
    public String toString() {
        return "Ball {" + "type = " + type + ", color = " + color + ", weight = " + weight + "g" + '}';
    }
}
