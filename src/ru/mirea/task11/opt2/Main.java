package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
    public JFrame frame1 = new JFrame("The one piece is real!");
    JFrame f;
    JLabel label_n = new JLabel("Welcome to the North blue!");
    JLabel label_s = new JLabel("Welcome to the South blue!");
    JLabel label_c = new JLabel("Welcome to the Grand Line!");
    JLabel label_w = new JLabel("Welcome to the West blue!");
    JLabel label_e = new JLabel("Welcome to the East blue!");
    JButton b1 = new JButton("NORTH");
    JButton b2 = new JButton("SOUTH");
    JButton b3 = new JButton("CENTER");
    JButton b4 = new JButton("WEST");
    JButton b5 = new JButton("EAST");
    Main()
    {

        f = new JFrame("Coordinates");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);


        f.setLayout(new BorderLayout());
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.CENTER);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.EAST);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setVisible(true);


        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        frame1.setSize(200, 100);
        if (e.getSource() == b1)
        {
            frame1.remove(label_c);
            frame1.remove(label_s);
            frame1.remove(label_w);
            frame1.remove(label_e);
            frame1.add(label_n, BorderLayout.CENTER);
            frame1.setVisible(true);
        }
        else if (e.getSource() == b2)
        {
            frame1.remove(label_n);
            frame1.remove(label_c);
            frame1.remove(label_w);
            frame1.remove(label_e);
            frame1.add(label_s, BorderLayout.CENTER);
            frame1.setVisible(true);
        }
        else if (e.getSource() == b3)
        {
            frame1.remove(label_n);
            frame1.remove(label_s);
            frame1.remove(label_w);
            frame1.remove(label_e);
            frame1.add(label_c, BorderLayout.CENTER);
            frame1.setVisible(true);
        }
        else if (e.getSource() == b4)
        {
            frame1.remove(label_n);
            frame1.remove(label_s);
            frame1.remove(label_c);
            frame1.remove(label_e);
            frame1.add(label_w, BorderLayout.CENTER);
            frame1.setVisible(true);
        }
        else if (e.getSource() == b5)
        {
            frame1.remove(label_n);
            frame1.remove(label_s);
            frame1.remove(label_c);
            frame1.remove(label_w);
            frame1.add(label_e, BorderLayout.CENTER);
            frame1.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        Main main = new Main();
    }
}
