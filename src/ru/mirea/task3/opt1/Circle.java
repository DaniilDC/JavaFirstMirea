package ru.mirea.task3.opt1;

public class Circle {
    public int r;
    public Circle(int r)
    {
        this.r = r;
    }
    public void SetRadius(int r)
    {
        this.r = r;
    }
    public int GetRadius(int r)
    {
        return r;
    }
    public void Square()
    {
        System.out.println("Square (approximately) = " + (int) (Math.PI * Math.pow(r, 2)));
    }
    public void Circumference() {
         System.out.println("Circumference (approximately) = " + (int) (Math.PI * 2 * r));
    }
}
