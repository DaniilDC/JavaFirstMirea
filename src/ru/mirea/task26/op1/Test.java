package ru.mirea.task26.op1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Способ оплаты: ");
        System.out.println("0 - Выход");
        System.out.println("1 - Виртуальный кошелёк");
        System.out.println("2 - Банковской картой");
        Payment epay = new EPay();
        Payment creditpayment = new CreditPayment();

        int choice = input.nextInt();

        if (choice == 1)
        {
            epay.askData();
        }
        else if (choice == 2)
        {
            creditpayment.askData();
        }
        else if (choice == 0)
        {
            return;
        }
    }
}
