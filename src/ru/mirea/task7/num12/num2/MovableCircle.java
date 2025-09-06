package ru.mirea.task7.num12.num2;

public class MovableCircle implements Movable{

    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", centerY=" + center.y +
                ", centerX=" + center.x +
                '}';
    }
}
