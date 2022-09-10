package ru.mirea.task1.opt7;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args)
    {
        System.out.println("Enter your non-negative number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) System.out.println("factorial = 1");
        else System.out.println("factorial = " + factorial(n));
    }
    public static int factorial(int n)
    {
        int f = 1;
        for (int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }
}
