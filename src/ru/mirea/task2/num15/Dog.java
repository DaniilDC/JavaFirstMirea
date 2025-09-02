package ru.mirea.task2.num15;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int dogToHuman(int age) {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "кличка: '" + name + '\'' +
                ", возраст: " + age +
                ", возраст в человеческих годах: " + dogToHuman(age) +
                '}';
    }
}
