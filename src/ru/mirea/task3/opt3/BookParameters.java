package ru.mirea.task3.opt3;

import java.util.Scanner;

public class BookParameters {
    public static void Parameters()
    {
        Scanner scan = new Scanner(System.in);
        Name name = new Name();
        Author author = new Author();
        Year year = new Year();
        Price price = new Price();


        System.out.println("Enter the name of the book");
        String n = scan.next();
        System.out.println("Enter book author");
        String a = scan.next();
        System.out.println("Enter the year the book was written");
        int y = scan.nextInt();
        System.out.println("Enter book price");
        int p = scan.nextInt();


        name.setName(n);
        author.setAuthor(a);
        year.setYear(y);
        price.setPrice(p);


        name.getName();
        author.getAuthor();
        year.getYear();
        price.getPrice();
    }
}
