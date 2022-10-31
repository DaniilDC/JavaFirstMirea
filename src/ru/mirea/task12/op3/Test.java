package ru.mirea.task12.op3;


import java.util.Arrays;

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
        Student[] list;
        Student[] list1 = new Student[5];
        Student[] list2 = new Student[5];
        for (int j = 0; j < 5; j++)
        {
            list1[j] = new Student();
            list2[j] = new Student();
        }

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        list = combine(list1, list2);

        System.out.println("Final array: " + Arrays.toString(list));

        mergeSort(list, 10);

        System.out.println("Sorted Array:" + Arrays.toString(list));
    }
    public static void mergeSort(Student[] a, int n)
    {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].ID <= r[j].ID) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static Student[] combine(Student[] array1, Student[] array2)
    {
        Student[] list = new Student[10];
        for (int i = 0; i < 5; i++)
        {
            list[i] = array1[i];
            list[i + 5] = array2[i];
        }
        return list;
    }
}
