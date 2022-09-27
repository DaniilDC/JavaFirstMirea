package ru.mirea.task6.op1;

public class Cat implements Nameable{
    public String name;

    public Cat(String name)
    {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Cat - " + name);
    }
}
