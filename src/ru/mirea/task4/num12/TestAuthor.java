package ru.mirea.task4.num12;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Шов");
        author.setGender('M');
        author.setEmail("шов@чиназес.ру");
        System.out.println(author.toString());
    }
}
