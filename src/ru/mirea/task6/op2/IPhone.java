package ru.mirea.task6.op2;

public class IPhone implements Priceable{
    int price;
    public IPhone(int price)
    {
        this.price = price;
    }
    @Override
    public void getPrice() {
        System.out.println("Price of the newest IPhone is " + price + "$.");
    }
}
