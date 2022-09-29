package ru.mirea.task7.op2;

public class Test {
    public static void main(String[] args)
    {
        Movable movable = new MovablePoint(10, 10, 5, 5);
        movable.moveUp();
        movable.moveDown();
        movable.moveLeft();
        movable.moveRight();
        System.out.println(movable.toString());

        Movable movable1 = new MovableCircle(10, 10, 5, 5, 7);
        movable1.moveUp();
        movable1.moveDown();
        movable1.moveLeft();
        movable1.moveRight();
        System.out.println(movable1.toString());

        Movable movable2 = new MovableRectangle(10, 10, 5, 5, 7, 7);
        movable2.moveUp();
        movable2.moveDown();
        movable2.moveLeft();
        movable2.moveRight();
        System.out.println(movable1.toString());
    }
}
