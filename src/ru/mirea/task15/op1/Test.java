package ru.mirea.task15.op1;
import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("/Users/Daniel/IdeaProjects/JavaFirstMirea/src/ru/mirea/task15/op1/Test.txt", false))
        {
            String s;
            System.out.println("Enter the data, if you want to end, write exit: ");
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

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
