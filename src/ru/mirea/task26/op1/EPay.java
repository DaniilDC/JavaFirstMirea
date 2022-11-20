package ru.mirea.task26.op1;

public class EPay extends Payment{
    public EPay() {
        this.paymentStrategy = new EPaymentStrategy();
    }
}
