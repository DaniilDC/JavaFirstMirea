package ru.mirea.task26.op1;

public class Payment {
    PaymentStrategy paymentStrategy;

    public void askData(){
        paymentStrategy.askData();
    }
}
