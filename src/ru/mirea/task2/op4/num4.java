package ru.mirea.task2.op4;

import ru.mirea.task2.op3.Book;

import java.util.Scanner;

public class num4 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dog's name");
        String current_name = scan.nextLine();
        System.out.println("Enter the dog's age");
        int current_age = scan.nextInt();
        Dog dog = new Dog(current_name, current_age);
        dog.SetName(current_name);
        dog.SetAge(current_age);
        dog.GetAge();
        dog.GetName();
        dog.GetHumanAge();
        System.out.println(dog);
    }
}
