package ru.mirea.task14.op1;

import java.util.Stack;


public class Test {

    public static void main(String[] args) {
        int[] a1 = new int[5];
        for (int m = 0; m < a1.length; m++) {
            a1[m] = ((int)(Math.random() * 10));
            {
                System.out.print(a1[m] + " ");
            }
        }
        int[] a2 = new int[5];
        System.out.print("\n");
        for (int l = 0; l < a2.length; l++) {
            a2[l] = ((int)((Math.random() * 10)));
            {
                System.out.print(a2[l] + " ");
            }
        }
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }

        int count = 0;
        boolean res = false;

        System.out.print("\n");

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
