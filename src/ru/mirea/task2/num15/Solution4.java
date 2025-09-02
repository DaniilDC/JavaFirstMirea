package ru.mirea.task2.num15;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog("", 0);
        System.out.print("Введите кличку собаки: ");
        String dog_name = scanner.nextLine();
        dog.setName(dog_name);

        System.out.print("Введите возраст собаки: ");
        int dog_age = scanner.nextInt();
        dog.setAge(dog_age);

        System.out.println(dog);
    }
}
