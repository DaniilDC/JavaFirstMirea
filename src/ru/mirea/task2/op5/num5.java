package ru.mirea.task2.op5;
import java.util.Scanner;

public class num5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dogs do you have?");
        int n = scan.nextInt();
        TestDog[] dogs = new TestDog[n];
        Add(dogs, n);
    }
    public static void Add(TestDog[] d, int n)
    {
        System.out.println("Enter the names of your dogs");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            d[i] = new TestDog(scan.next());
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println((i + 1) + " " + d[i].toString());
        }
    }
}
