package ru.mirea.task10.op10;

public class Test {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println(recursion(432, 0));
    }
}
