package ru.mirea.task26.op1;

import java.util.Scanner;

public class EPaymentStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of your wallet");
        int number = input.nextInt();

        System.out.println("Order confirmed");
    }
}
