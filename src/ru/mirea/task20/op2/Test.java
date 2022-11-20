package ru.mirea.task20.op2;

import java.util.Date;

public class Test {

    public static void Task2() {
        System.out.println("Второе упражнение");
        System.out.println("Фамилия разработчика: Чернышов");
        Date start_time = new Date();
        start_time.setDate(14);
        start_time.setMonth(11);
        start_time.setHours(17);
        start_time.setMinutes(50);
        System.out.println("Задание получено: " + start_time.getDate() + "." + start_time.getMonth() + " " + start_time.getHours() + ":" + start_time.getMinutes());
        System.out.println("Задание сдано:    " + new Date().getDate() + "." + new Date().getMonth() + " " + new Date().getHours() + ":" + new Date().getMinutes());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Task2();
    }
}
