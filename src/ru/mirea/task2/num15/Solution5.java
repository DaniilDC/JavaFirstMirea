package ru.mirea.task2.num15;

import java.util.Scanner;

public class Solution5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Сколько у вас собак? (Введите целочисленное значение) ");

        int n = scanner.nextInt();
        scanner.nextLine();

        if (n == 1) {
            System.out.print("Как её зовут? ");
            String name = scanner.nextLine();
            TestDog dog = new TestDog(name);
            System.out.println("Собачка: " + dog.toString());
        } else if (n < 1) {
            System.out.println("Иди лесом.");
        } else {
            TestDog[] dogs = new TestDog[n];
            add(dogs, n);
        }
    }
    public static void add(TestDog[] d, int n) {
        System.out.println("Вводите имена собачек через Enter: ");
        for (int i = 0; i < n; i++) {
            d[i] = new TestDog(scanner.nextLine());
        }
        System.out.println("Ваши собачки: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Собачка " + (i + 1) + ": " + d[i].toString());
        }
    }
}
