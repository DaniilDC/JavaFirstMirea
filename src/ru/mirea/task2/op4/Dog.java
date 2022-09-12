package ru.mirea.task2.op4;

public class Dog {
    public String name;
    public int age;
    public int HumanAge;
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void SetName(String sharik)
    {
        String n = name;
    }
    public void SetAge(int i)
    {
        int a = age;
    }
    public String GetName()
    {
        return name;
    }
    public int GetAge()
    {
        return age;
    }
    public int GetHumanAge()
    {
        return age * 7;
    }
    public String toString() {
        return "Dog {" + "name = " + name + ", age = " + age + ", age to human = " + GetHumanAge() + '}';
    }
}
