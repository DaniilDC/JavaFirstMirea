package ru.mirea.task12.op2;

import java.util.*;

class Student {
    public int ID;
    Student()
    {
        ID = (int) (Math.random() * 100);
    }
    public int getID()
    {
        return ID;
    }

    @Override
    public String toString()
    {
        return "Student {" + "ID = " + ID + '}';
    }
}


public class Test{
    public static void main(String [] args)
    {
        Student[] IDNumber = new Student[10];
        for (int j = 0; j < 10; j++)
        {
            IDNumber[j] = new Student();
        }
        System.out.println(Arrays.toString(IDNumber));
        QuickSort(IDNumber, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(IDNumber));

    }
    public static void QuickSort(Student[] array,  SortingStudentsByGPA sortingStudentsByGPA)
    {
        Arrays.sort(array, sortingStudentsByGPA);
    }
}

