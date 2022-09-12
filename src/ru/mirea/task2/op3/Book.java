package ru.mirea.task2.op3;

public class Book {
    public String name;
    public String author;
    public int price;
    public Book(String name, String author, int price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String toString() {
        return "Book {" + "name = " + name + ", author = " + author + ", price = " + price + "RUB" + '}';
    }
}
