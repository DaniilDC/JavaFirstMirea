package ru.mirea.task10.op6;

public class Test {

    public static String is_prime(int n, int i) {
        if (n < 2) {return "Wrong";}
        else if (n == 2) {return "YES";} // Базовый случай
        else if (n % i == 0) {return "NO";}
        else if (i < n / 2)
        {
            return is_prime(n, i + 1);
        } else
        {
            return "YES";
        }
    }
    public static void main(String [] args)
    {
        System.out.println(is_prime(9, 2));
    }
}
