package ru.mirea.task1.opt3;
import java.util.Scanner;

public class num3
{
    static int[] myArray;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        int n = scan.nextInt();
        myArray = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + myArray[i]); // Выводим на экран, полученный массив
        }
        For();
        While();
        DoWhile();
    }
    public static void For()
    {
        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        System.out.println("\nSum (for) = " + sum);
    }
    public static void While()
    {
        int sum = 0;
        int i = 0;
        while (i < myArray.length)
        {
            sum += myArray[i];
            i++;
        }
        System.out.println("Sum (while) = " + sum);
    }
    public static void DoWhile()
    {
        int sum = 0;
        int i = 0;
        do
        {
            sum += myArray[i];
            i++;
        } while (i < myArray.length);
        System.out.println("Sum (do while) = " + sum);
    }
}

