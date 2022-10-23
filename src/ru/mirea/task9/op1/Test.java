package ru.mirea.task9.op1;

public class Test {
    public static void main(String [] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gui();
            }
        });
    }
}
