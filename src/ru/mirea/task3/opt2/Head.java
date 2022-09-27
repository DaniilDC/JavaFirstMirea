package ru.mirea.task3.opt2;

public class Head {
    public String eye_color;
    public String hair_color;
    public void SetHead(String eye_color, String hair_color)
    {this.eye_color = eye_color; this.hair_color = hair_color;}
    public void GetEye_Color()
    {System.out.println("Eye color: " + eye_color);}
    public void GetHair_Color()
    {System.out.println("Hair color: " + hair_color);}
}
