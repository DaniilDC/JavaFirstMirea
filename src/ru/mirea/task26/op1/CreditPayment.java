package ru.mirea.task26.op1;

public class CreditPayment extends Payment{
    public CreditPayment() {
        this.paymentStrategy=new CreditPaymentStrategy();
    }
}
