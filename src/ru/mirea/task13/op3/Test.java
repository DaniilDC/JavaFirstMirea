package ru.mirea.task13.op3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the your own list test!");


        System.out.println("Enter the amount of elements of your list: ");
        int amount = input.nextInt();
        String[] array = new String[amount];
        MyList<String> list = new MyList<>(array);
        String word;
        System.out.println("Enter " + amount + " words: ");

        for (int i = 0; i < amount; i++)
        {
            word = input.next();
            list.set(i, word);
        }

        System.out.println(list);
        System.out.println("Your list has " + list.size() + " elements.");
        System.out.println("Enter the index of the element you are looking for: ");
        int index = input.nextInt() - 1;

        System.out.println("Your element: " + list.get(index));
    }

}
