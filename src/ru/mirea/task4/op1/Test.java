package ru.mirea.task4.op1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Enter the Author's name: ");
        name = input.nextLine();
        System.out.print("Enter the Author's email: ");
        email = input.nextLine();
        System.out.print("Enter the Author's gender: ");
        String s = input.next();
        gender = s.charAt(0);
        Author author = new Author(name, email, gender);
        System.out.print(author.toString());
    }
}
