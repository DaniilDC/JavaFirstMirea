package ru.mirea.task15.op3;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        File f = new File("/Users/Daniel/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/op3/Test.txt");

        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        System.out.println("Your file: ");
        while ((line = fin.readLine()) != null) System.out.println(line);

        System.out.println("Enter the text you want to paste: ");

        FileWriter writer = new FileWriter("/Users/Daniel/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/op3/Test.txt", false);
        String s;
        s = input.next();
        writer.write(s);

        while (true)
        {
            if (!Objects.equals(s, ""))
            {
                s = input.nextLine();
                writer.write(s);
                writer.append("\n");
            }
            else
            {
                writer.flush();
                break;
            }
        }
        System.out.println("Your file: ");
        BufferedReader fin1 = new BufferedReader(new FileReader(f));
        while ((line = fin1.readLine()) != null) System.out.println(line);
    }
}
