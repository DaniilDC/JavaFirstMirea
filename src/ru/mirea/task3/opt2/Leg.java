package ru.mirea.task3.opt2;

public class Leg {
    public int european_size;
    public int leg_length;
    public void SetLeg(int european_size, int leg_length)
    {this.european_size = european_size; this.leg_length = leg_length;}
    public void GetEuropean_Size()
    {System.out.println("European foot size: " + european_size);}
    public void GetLeg_Length()
    {System.out.println("Leg length (mm): " + leg_length);}
}
