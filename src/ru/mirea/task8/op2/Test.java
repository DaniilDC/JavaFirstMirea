package ru.mirea.task8.op2;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test  extends JFrame {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String path = input.next();


        JFrame frame = new JFrame("Image");
        ImageIcon icon = new ImageIcon(path);
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(icon));


        frame.add(jPanel);
        frame.setSize(icon.getIconWidth(), icon.getIconHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
