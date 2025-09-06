package ru.mirea.task7.num12.num2;

public class TestMovable {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(10, 10, 2, 2);
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveUp();
        movablePoint.moveUp();
        System.out.println(movablePoint.toString());

        Movable movableCircle = new MovableCircle(10, 10, 3, 3, 5);
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveDown();
        System.out.println(movableCircle.toString());
    }
}
