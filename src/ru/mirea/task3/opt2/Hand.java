package ru.mirea.task3.opt2;

public class Hand {
    public String tatoo;
    public int middle_finger_size;
    public void SetHand(String tatoo, int middle_finger_size)
    {this.tatoo = tatoo; this.middle_finger_size = middle_finger_size;}
    public void GetMiddle_Finer_Size()
    {System.out.println("Middle finger length (mm): " + middle_finger_size);}
    public void GetTatoo()
    {System.out.println( "Tattoo type: " + tatoo);}
}
