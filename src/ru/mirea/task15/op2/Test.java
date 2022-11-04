package ru.mirea.task15.op2;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/Daniel/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/op2/Test.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        System.out.println("Your file: ");
        while ((line = fin.readLine()) != null) System.out.println(line);
    }
}
