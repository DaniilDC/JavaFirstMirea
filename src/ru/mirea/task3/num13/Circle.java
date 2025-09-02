package ru.mirea.task3.num13;

public class Circle {
    int r;
    public Circle(int r) { this.r = r; }
    public int getR() { return r; }
    public void setR(int r) { this.r = r; }
    double square(int r) { return (int) (Math.PI * Math.pow(r, 2)); }
    @Override
    public String toString() {
        return "S = " + square(r);
    }
}
