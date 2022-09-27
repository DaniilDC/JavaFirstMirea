package ru.mirea.task5.op3;
import java.util.Scanner;

public class Chair extends Furniture{
    @Override
    public void Type() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of your chair legs: ");
        int amount;
        amount = input.nextInt();
        System.out.println("A chair with " + amount + " legs.");
    }
}
