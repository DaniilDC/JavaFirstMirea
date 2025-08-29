package ru.mirea.task1.num37;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");

        int dimension = scanner.nextInt();
        int[] array_of_numbers = new int[dimension];
        int sum = 0;

        System.out.println("""
                Выберите способ вычисление:
                1 - for
                2 - while
                3 - do while""");
        int choose = scanner.nextInt();

        System.out.println("Вводите значения массива через Enter");
        for (int i = 0; i < dimension; i++) {
            array_of_numbers[i] = scanner.nextInt();
            sum += array_of_numbers[i];
        }

        if (choose == 1) {
            System.out.println("For: " + sum);
        } else if (choose == 2) {
            int i = 0;
            sum = 0;
            while (i < dimension) {
                sum += array_of_numbers[i];
                i++;
            }
            System.out.println("While: " + sum);
        } else if (choose == 3) {
            int i = 0;
            sum = 0;
            do {
                sum += array_of_numbers[i];
                i++;
            } while (i < dimension);
            System.out.println("Do while: " + sum);
        } else {
            System.out.println("Некорректный ввод.");
        }
    }
}
