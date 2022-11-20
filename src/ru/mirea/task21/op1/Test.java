package ru.mirea.task21.op1;

import java.util.ArrayList;

public class Test {

    static class Metro {
        static ArrayList<String> metroList = new ArrayList<>();
        static {

            metroList.add("Люблинско-Дмитровская");
            metroList.add("Большая кольцевая");
            metroList.add("Бутовская");
            metroList.add("Некрасовская");
            metroList.add("Сокольническая");
            metroList.add("Замоскворецкая");
            metroList.add("Арбатско-Покровская");
            metroList.add("Филёвская");
            metroList.add("Кольцевая");
            metroList.add("Калужско-Рижская");
            metroList.add("Таганско-Краснопресненская");
            metroList.add("Калининская");
            metroList.add("Серпуховско-Тимирязевская");
        }

        static void PrintList(boolean even) {
            for (int i = 0; i<metroList.size(); i++){
                if (even) {
                    if (i % 2 == 0) {
                        System.out.println("["+i + "] " + metroList.get(i));
                    }
                }
                else {
                    if (i % 2 == 1) {
                        System.out.println("["+i + "] " + metroList.get(i));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Четные элементы списка: ");
        Metro.PrintList(true);
        System.out.println("Нечетные элементы списка: ");
        Metro.PrintList(false);
    }
}
