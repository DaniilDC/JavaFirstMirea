package ru.mirea.task1.opt5;
import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        double res = 0;
        for(int i = 1;i < 11; i++){
            double a = 1.0 / i;
            res += a;
            System.out.println("num " + a);
        }
        System.out.print("Result: " + res);
    }
}