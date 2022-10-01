package ru.mirea.task8.op3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Test  extends JFrame {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Animation");
        JPanel jPanel = new JPanel(new BorderLayout());


        String path = "C:\\Users\\Daniel\\Pictures\\animation";


        String[] images = new File(path).list();
        assert images != null;


        int num = Math.min(images.length, 19);
        Image[] image1 = new Image[num];
        for (int i = 0; i < num; i++) {image1[i] = Toolkit.getDefaultToolkit().createImage(path + "\\" + images[i]);}
        JLabel jLabel = new JLabel(new ImageIcon(image1[0]));
        jPanel.add(jLabel, BorderLayout.CENTER);


        ActionListener actionListener = new ActionListener() {
            private int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < image1.length - 1) index++;
                else index = 0;
                jLabel.setIcon(new ImageIcon(image1[index]));
            }
        };

        Timer timer = new Timer(100, actionListener);
        timer.start();


        frame.add(jPanel);
        frame.setSize(200, 190);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}