package ru.mirea.task13.op1;

import java.util.*;

public class Test{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        String[] substr;
        String delimeter = " ";

        String str = "Welcome to the ArrayList test";
        substr = str.split(delimeter);

        list.addAll(Arrays.asList(substr));

        System.out.println(list);

        System.out.println("Enter the new element of your list: ");

        String new_s = input.next();

        list.add(new_s);

        System.out.println(list);

        System.out.println("Enter the element that you want find: ");

        String find_s = input.next();

        if (list.contains(find_s))
        {
            System.out.println("Your element has been found, do you want to delete it? (yes or no)");
            String choose = input.next();
            if (Objects.equals(choose, "yes"))
            {
                System.out.println("Your element has been deleted, your list: ");
                list.remove(find_s);
                System.out.println(list);
            }
            else {
                System.out.println("OK :( ");
            }
        }
        else {
            System.out.println("Your element has not been found");
        }
    }
}
