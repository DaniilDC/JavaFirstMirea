package ru.mirea.task2.num15;

public class Book {
    String name;
    String author;
    int amount_of_pages;

    public Book(String name, String author, int amount_of_pages) {
        this.name = name;
        this.author = author;
        this.amount_of_pages = amount_of_pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "название: '" + name + '\'' +
                ", автор: '" + author + '\'' +
                ", количество страниц: " + amount_of_pages +
                '}';
    }
}
