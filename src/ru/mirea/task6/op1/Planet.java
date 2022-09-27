package ru.mirea.task6.op1;

public class Planet implements Nameable {
    public String name;
    public Planet(String name)
    {
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println("Planet - " + name);
    }
}
