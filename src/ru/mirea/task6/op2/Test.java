package ru.mirea.task6.op2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int price, price1;
        System.out.println("Enter the price of IPhone 14.");
        price = input.nextInt();
        System.out.println("Enter the price of BMW M5 F90.");
        price1 = input.nextInt();
        IPhone iPhone = new IPhone(price);
        Car car = new Car(price1);
        iPhone.getPrice();
        car.getPrice();
    }
}
