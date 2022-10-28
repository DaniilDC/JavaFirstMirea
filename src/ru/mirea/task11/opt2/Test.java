package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test extends JFrame implements MouseListener {

    public static void main(String [] args)
    {
        new Test();
    }

    JFrame f = new JFrame("Map");
    JLabel b1 = new JLabel("NORTH");
    JLabel b2 = new JLabel("SOUTH");
    JLabel b3 = new JLabel("CENTER");
    JLabel b4 = new JLabel("WEST");
    JLabel b5 = new JLabel("EAST");

    Test()
    {

        Container c = f.getContentPane();
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(300, 300);

        b1.setHorizontalAlignment(JLabel.CENTER);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b3.setHorizontalAlignment(JLabel.CENTER);
        b4.setHorizontalAlignment(JLabel.CENTER);
        b5.setHorizontalAlignment(JLabel.CENTER);

        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);

        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.CENTER);
        c.add(b4, BorderLayout.WEST);
        c.add(b5, BorderLayout.EAST);



        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object source = e.getSource();
        if (b1.equals(source)) {
            JOptionPane.showMessageDialog(b1, "Welcome to the North Blue");
        } else if (b2.equals(source)) {
            JOptionPane.showMessageDialog(b2, "Welcome to the South Blue");
        } else if (b3.equals(source)) {
            JOptionPane.showMessageDialog(b3, "Welcome to the Grand Line");
        } else if (b4.equals(source)) {
            JOptionPane.showMessageDialog(b4, "Welcome to the West Blue");
        } else if (b5.equals(source)) {
            JOptionPane.showMessageDialog(b5, "Welcome to the East Blue");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
