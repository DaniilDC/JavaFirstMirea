package ru.mirea.task1.opt4;
import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(scan.next());
        }
    }
}
