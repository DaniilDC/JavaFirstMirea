package ru.mirea.task12.op2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2)
    {
        return -1 * (s1.getID() - s2.getID());
    }
}
