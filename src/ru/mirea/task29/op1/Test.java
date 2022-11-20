package ru.mirea.task29.op1;


import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo obj1, obj2;
        obj1 = new CurrencyInfo("Dollar", 60.56);

        System.out.println("Сериализация\n"+obj1.toString());
        FileOutputStream outputStream = new FileOutputStream("src\\ru\\mirea\\task29\\task29ser.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(obj1);
        objectOutputStream.close();

        System.out.println("---------------------------------------------------------------------------------------");

        FileInputStream fileInputStream = new FileInputStream("src\\ru\\mirea\\task29\\task29ser.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        obj2 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println("Дессериализация\n" + obj2.toString());
    }
}
