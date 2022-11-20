package ru.mirea.task20.op1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {
    public static void DateTask() {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Работа с классом Date: ");
        System.out.print("Введите год: ");
        year=scanner.nextInt();
        System.out.print("Введите месяц: ");
        month=scanner.nextInt();
        System.out.print("Введите дату: ");
        date=scanner.nextInt();
        System.out.print("Введите час: ");
        hours =scanner.nextInt();
        System.out.print("Введите минуты: ");
        min =scanner.nextInt();
        Date user_date = new Date(year-1901, month, date, hours, min);
        System.out.println(user_date);
        System.out.println("Год: " + user_date.getYear());
        System.out.println("Месяц: " + user_date.getMonth());
        System.out.println("Число: " + user_date.getDate());
        System.out.println("Часы: " + user_date.getHours());
        System.out.println("Минуты: " + user_date.getMinutes());
    }

    public static void CalendarTask() {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        int year, month, date, hours, min;
        System.out.println("Работа с классом Calendar: ");
        System.out.print("Введите год: ");
        year=scanner.nextInt();
        System.out.print("Введите месяц: ");
        month=scanner.nextInt();
        System.out.print("Введите дату: ");
        date=scanner.nextInt();
        System.out.print("Введите час: ");
        hours =scanner.nextInt();
        System.out.print("Введите минуты: ");
        min =scanner.nextInt();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, min);
        System.out.println("Год: " + calendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
    }
    public static void main(String[] args) {
        DateTask();
        CalendarTask();
    }
}
