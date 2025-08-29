package ru.mirea.task1.num37;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество аргументов: ");
        int dimension = scanner.nextInt();
        int[] array_of_args = new int[dimension];

        System.out.println("Вводите построчно");
        for (int i = 0; i < dimension; i++) {
            array_of_args[i] = scanner.nextInt();
            System.out.println(array_of_args[i]);
        }
        System.out.println(Arrays.toString(array_of_args));
    }
}
