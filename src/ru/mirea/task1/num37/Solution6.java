package ru.mirea.task1.num37;

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        int dimension = 10;
        int[] array = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
