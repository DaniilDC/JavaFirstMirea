package ru.mirea.task17.op1;

import java.util.Scanner;

public class Test {
    enum Planet{
        Mercury(3.3*Math.pow(10,23), 2.4*Math.pow(10,6)),
        Venus(4.9*Math.pow(10,24), 6.1*Math.pow(10,6)),
        Earth(6*Math.pow(10,24), 6.4*Math.pow(10,6)),
        Mars(3.4*Math.pow(10,23),3.4*Math.pow(10,6)),
        Jupiter(1.9*Math.pow(10,27),71*Math.pow(10,6)),
        Saturn(5.7*Math.pow(10,26),60*Math.pow(10,6)),
        Uranus(8.7*Math.pow(10,25),26*Math.pow(10,6)),
        Neptune(Math.pow(10,26),25*Math.pow(10,6));
        public final double mass;
        public final double radius;
        Planet (double mass, double radius){
            this.mass=mass;
            this.radius=radius;
        }

        public String getInfo()
        {
            return "Масса = " + mass + "\n Радиус = " + radius + "\n Сила притяжения = " +
                    6.67*Math.pow(10, -11)*(this.mass/Math.pow(this.mass,2));
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Меню");
        System.out.println("1 - Меркурий");
        System.out.println("2 - Венера");
        System.out.println("3 - Земля");
        System.out.println("4 - Марс");
        System.out.println("5 - Юпитер");
        System.out.println("6 - Сатурн");
        System.out.println("7 - Уран");
        System.out.println("8 - Нептун");

        System.out.println("Введите номер планеты, информацию о которой вы хотите узнать:");

        int choice = input.nextInt();
        while (choice != 0)
        {
            int n = choice;
            switch (n)
            {
                case 1 -> System.out.println("Меркурий" + Planet.Mercury.getInfo());
                case 2 -> System.out.println("Венера" + Planet.Venus.getInfo());
                case 3 -> System.out.println("Земля" + Planet.Earth.getInfo());
                case 4 -> System.out.println("Марс" + Planet.Mars.getInfo());
                case 5 -> System.out.println("Юпитер" + Planet.Jupiter.getInfo());
                case 6 -> System.out.println("Сатурн" + Planet.Saturn.getInfo());
                case 7 -> System.out.println("Уран" + Planet.Uranus.getInfo());
                case 8 -> System.out.println("Нептун" + Planet.Neptune.getInfo());
            }
            choice = input.nextInt();
        }
    }
}

