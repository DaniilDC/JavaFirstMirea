package ru.mirea.task12.op1;
import java.net.IDN;
import java.util.Arrays;
import java.util.regex.*;

class Student {
    public int ID;
    Student()
    {
        ID = (int) (Math.random() * 100);
    }

    @Override
    public String toString()
    {
        return "Student {" + "ID = " + ID + '}';
    }
}

public class Test {
    public static void main(String [] args)
    {
        Student[] IDNumber = new Student[10];
        for (int j = 0; j < 10; j++)
        {
            IDNumber[j] = new Student();
        }

        System.out.println(Arrays.toString(IDNumber));
        InsertionSort(IDNumber);
        System.out.println(Arrays.toString(IDNumber));
    }

    public static void InsertionSort(Student[] array)
    {
        int j;
        for (int i = 1; i < array.length; i++) {
            Student swap = array[i];
            for (j = i; j > 0 && swap.ID < array[j - 1].ID; j--)
            {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }
}
