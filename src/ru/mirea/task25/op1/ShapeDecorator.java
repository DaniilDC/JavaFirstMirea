package ru.mirea.task25.op1;

public abstract class ShapeDecorator {
    public Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape=shape;
    }

    abstract void draw();
}
