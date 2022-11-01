package ru.mirea.task13.op3;

import java.util.Arrays;

public class MyList<T>{
    private final T[] a;

    public MyList(T[] a) {
        this.a = a;
    }

    public T get(int index) {
        return a[index];
    }

    public T set(int index, T element) {
        T oldValue = a[index];
        a[index] = element;
        return oldValue;
    }
    public int size() {
        return a.length;
    }

    @Override
    public String toString() {
        return "Your list: " + Arrays.toString(a);
    }
}
