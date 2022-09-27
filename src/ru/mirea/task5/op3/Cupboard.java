package ru.mirea.task5.op3;
import java.util.Scanner;

public class Cupboard extends Furniture{
    @Override
    public void Type() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height (m): ");
        int height;
        height = input.nextInt();
        System.out.println(height + " - meter height cupboard.");
    }
}
