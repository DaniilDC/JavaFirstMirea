package ru.mirea.task3.opt1;


import java.util.Scanner;

public class CircleTest {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your circle");
        int radius = scan.nextInt();
        Circle circle = new Circle(radius);
        circle.SetRadius(radius);
        circle.GetRadius(radius);
        circle.Square();
        circle.Circumference();
    }
}
