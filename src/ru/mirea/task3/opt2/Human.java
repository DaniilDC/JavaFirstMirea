package ru.mirea.task3.opt2;

import java.util.Scanner;

public class Human {
    public static void HumanParameters()
    {
        Hand hand = new Hand();
        Leg leg = new Leg();
        Head head = new Head();
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the parameters of your Human");
        System.out.println("What is his middle finger size in mm?");
        int mfz = scan.nextInt();
        System.out.println("What kind of tattoo do you have?");
        String tt = scan.next();


        System.out.println("What is his foot size (european)?");
        int size = scan.nextInt();
        System.out.println("What is his leg length in mm?");
        int len = scan.nextInt();


        System.out.println("What is your eye color?");
        String color = scan.next();
        System.out.println("What is your hair color?");
        String color1 = scan.next();


        hand.SetHand(tt, mfz);
        leg.SetLeg(size, len);
        head.SetHead(color, color1);


        hand.GetMiddle_Finer_Size();
        hand.GetTatoo();
        leg.GetEuropean_Size();
        leg.GetLeg_Length();
        head.GetEye_Color();
        head.GetHair_Color();
    }
}
