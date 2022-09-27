package ru.mirea.task4.op2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Ball ball = new Ball();
        double x, y, x1, y1;
        System.out.print("Enter the x coordinates: ");
        x = input.nextDouble();
        System.out.print("y: ");
        y = input.nextDouble();
        ball.setXY(x, y);
        System.out.println(ball.toString());
        System.out.print("Enter x offset: ");
        x1 = input.nextDouble();
        System.out.print("y: ");
        y1 = input.nextDouble();
        ball.move(x1, y1);
        System.out.print(ball.toString());
    }
}
