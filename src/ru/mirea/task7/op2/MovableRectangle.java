package ru.mirea.task7.op2;

public class MovableRectangle implements Movable{
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.topLeft.y += topLeft.ySpeed;
        this.bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x += topLeft.xSpeed;
        this.bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "{MovableRectangle: " +
                "topLeft = " + topLeft.toString() +
                ", bottomRight = " + bottomRight.toString() +
                '}';
    }
}
