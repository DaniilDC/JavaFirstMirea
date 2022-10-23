package ru.mirea.task9.op1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class gui extends JFrame {
    int sum_r = 0;
    int sum_b = 0;
    public gui(){

        JPanel jPanel = new JPanel();
        JFrame frame = new JFrame("Football");
        JLabel jLabel = new JLabel();
        jLabel.setText("Result: " + sum_r + "X" + sum_b);
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        frame.setSize(300,200);


        JButton b1 = new JButton();
        b1.setVisible(true);
        b1.setText("FC Madrid");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum_r++;
                jLabel.setText("Result: " + sum_r + "X" + sum_b);
                if (sum_r == 10)
                {
                    jLabel2.setText("The winner is: " + b1.getText());
                    jLabel1.setText("Last Scorer: " + b1.getText());
                    jPanel.add(jLabel1);
                    jPanel.add(jLabel2);
                }
            }
        });


        JButton b2 = new JButton();
        b2.setVisible(true);
        b2.setText("FC Barcelona");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sum_b++;
                jLabel.setText("Result: " + sum_r + "X" + sum_b);
                jLabel1.setText("Last Scorer: " + b2.getText());
                if (sum_b == 10)
                {
                    jLabel2.setText("The winner is: " + b2.getText());
                    jLabel1.setText("Last Scorer: " + b2.getText());
                    jPanel.add(jLabel1);
                    jPanel.add(jLabel2);
                }
            }
        });


        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(jLabel);


        frame.add(jPanel);
        frame.setVisible(true);
    }
}
