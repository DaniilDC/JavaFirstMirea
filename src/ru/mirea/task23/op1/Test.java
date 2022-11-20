package ru.mirea.task23.op1;


public class Test {
    public static void compare(Guitar guitar1, Guitar guitar2)
    {
        System.out.println(guitar1.toString());
        System.out.println(guitar2.toString());

        if (guitar1.equals(guitar2) && guitar1.hashCode() == guitar2.hashCode())
        {
            System.out.println("Каждая гитара уникальна, но данные похожи!");
        }
        else
        {
            System.out.println("Каждая гитара уникальна!");
        }
    }

    public static void main(String[] args)
    {
        Guitar guitar1, guitar2, guitar3, guitar4;

        guitar1 = new LesPaul("Gibson", 3600, "Les Paul");
        guitar2 = new ESP("ESP", 2500, "ESP Landers");
        guitar3 = new Telecaster("Fender", 3400, "Telecaster");
        guitar4 = new Telecaster("Fender", 3400, "Telecaster");

        compare(guitar1, guitar2);
        compare(guitar1, guitar3);
        compare(guitar1, guitar4);

        compare(guitar2, guitar3);

        compare(guitar3, guitar4);
    }
}
