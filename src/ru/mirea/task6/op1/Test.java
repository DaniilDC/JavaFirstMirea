package ru.mirea.task6.op1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Planet.");
        String name_p, name_c;
        name_p = input.next();
        System.out.println("Enter your cat's name.");
        name_c = input.next();
        Planet planet = new Planet(name_p);
        Cat cat = new Cat(name_c);
        planet.getName();
        cat.getName();
    }
}
