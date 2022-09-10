package ru.mirea.task1.opt6;

import  java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class num6 {
    static int[] myArray;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        int n = scan.nextInt();
        myArray = new int[n];
        System.out.println("Array of randomly generated elements before sorting");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((int)(Math.random() * 100));
        }
        System.out.println(Arrays.toString(myArray)); //метод вывода одномерного массива через запятую
        Arrays.sort(myArray);
        System.out.println("\nArray of randomly generated elements after sorting \n" + Arrays.toString(myArray));
    }
}
