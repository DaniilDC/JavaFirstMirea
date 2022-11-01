package ru.mirea.task13.op2;

import java.util.*;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ammu-Nation, enter the types of pistol, sword and rifle: ");

        String pistol = input.next();
        String sword = input.next();
        String rifle = input.next();

        LinkedList<String> list = new LinkedList<>();

        list.add(pistol);
        list.add(sword);
        list.add(rifle);

        System.out.println(list);

        System.out.println("Enter the new weapon to add it in the beginning of your LinkedList");

        String new_weapon = input.next();
        list.addFirst(new_weapon);

        System.out.println("Enter the new weapon to add it in the ending of your LinkedList");

        String new_weapon1 = input.next();
        list.addLast(new_weapon1);

        System.out.println(list);

        System.out.println("Enter the weapon that you nat find");
        String find_s = input.next();

        if (list.contains(find_s))
        {
            System.out.println("Your element has been found, do you want to find the first and the last element? (yes or no)");
            String choose = input.next();
            if (Objects.equals(choose, "yes"))
            {
                System.out.println("Your elements: ");
                System.out.println(list.getFirst());
                System.out.println(list.getLast());
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
