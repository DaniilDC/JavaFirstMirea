package ru.mirea.task26.op1;

import java.util.Scanner;

public class CreditPaymentStrategy implements PaymentStrategy{

    @Override
    public void askData() {
        Scanner input = new Scanner(System.in);

        int number, CVV, data;

        System.out.println("Enter the number of your card");

        number = input.nextInt();

        System.out.println("Enter the validity of your card");

        CVV = input.nextInt();

        System.out.println("Enter the CVV of your card");

        data = input.nextInt();

        System.out.println("Order confirmed");
    }
}
