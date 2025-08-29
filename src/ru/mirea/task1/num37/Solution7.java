package ru.mirea.task1.num37;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Не определён");
        } else if (n == 0) {
            System.out.println(0);
        } else {
            while (n != 0) {
                result *= n;
                n--;
            }
        }
        return result;
    }
}
