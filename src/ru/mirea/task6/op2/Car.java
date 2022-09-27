package ru.mirea.task6.op2;

public class Car implements Priceable{
    int price;
    public Car(int price)
    {
        this.price = price;
    }
    @Override
    public void getPrice() {
        System.out.println("Price of the newest BMW M5 F90 is " + price + "$.");
    }
}
