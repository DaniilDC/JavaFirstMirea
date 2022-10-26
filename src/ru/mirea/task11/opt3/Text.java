package ru.mirea.task11.opt3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text extends JFrame implements ActionListener{
    JTextArea t;
    JFrame f;
    Text()
    {
        f = new JFrame("Text redactor");

        t = new JTextArea();

        JMenuBar mb = new JMenuBar();


        JMenu m1 = new JMenu("Color");
        m1.addActionListener(this);

        JMenuItem mi1 = new JMenuItem("Red");
        JMenuItem mi2 = new JMenuItem("Green");
        JMenuItem mi3 = new JMenuItem("Blue");



        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);



        JMenu m2 = new JMenu("Font");
        m2.addActionListener(this);



        JMenuItem mi4 = new JMenuItem("Times new roman");
        JMenuItem mi5 = new JMenuItem("Calibri");
        JMenuItem mi6 = new JMenuItem("Impact");


        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        m2.add(mi4);
        m2.add(mi5);
        m2.add(mi6);

        JMenuItem mc = new JMenuItem("close");

        mc.addActionListener(this);

        mb.add(m1);
        mb.add(m2);
        mb.add(mc);

        f.setJMenuBar(mb);
        f.add(t);
        f.setSize(500, 500);
        f.show();
    }


    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        switch (s) {
            case "Red" -> t.setForeground(Color.RED);
            case "Green" -> t.setForeground(Color.GREEN);
            case "Blue" -> t.setForeground(Color.BLUE);
            case "close" -> f.setVisible(false);
            case "Times new roman" -> t.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            case "Calibri" -> t.setFont(new Font("Calibri", Font.PLAIN, 14));
            case "Impact" -> t.setFont(new Font("Impact", Font.PLAIN, 14));
        }
    }
    public static void main(String args[])
    {
        Text e = new Text();
    }
}
