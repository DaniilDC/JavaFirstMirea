package ru.mirea.task18.op1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String FIO, INN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        FIO = scanner.nextLine();
        System.out.print("Введите номер ИНН: ");
        INN = scanner.next();
        try {
            Integer.parseInt(INN); //проверка введённого пользователем ИНН на присутствие букв в нём
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка, введен недействительный ИНН: " + e.getMessage());
        }
    }
}
