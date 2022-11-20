package ru.mirea.task25.op1;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    void draw() {
        shape.draw();
    }

    void setRedBoarder(){
        System.out.println("Red border has been set");
    }
}
