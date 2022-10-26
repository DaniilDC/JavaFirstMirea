package ru.mirea.task11.op1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame
{
    JTextField guess, totalguess;
    ButtonListener buttonListener;
    JLabel inputlabel, trylabel, totalguesslabel;
    JButton guessbutton =new JButton("Guess");

    int rand=(int) (Math.random()*20);
    int count=0;
    public Main()
    {
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);


        inputlabel=new JLabel("Enter a number between 0-20");
        inputlabel.setSize(270,20);
        inputlabel.setLocation(70,90);

        trylabel = new JLabel("Try and guess it !");
        trylabel.setSize(270,20);
        trylabel.setLocation(110,160);

        guess = new JTextField(10);
        guess.setSize(50,30);
        guess.setLocation(140,120);


        totalguess = new JTextField(10);
        totalguess.setSize(30,20);
        totalguess.setLocation(10,40);

        totalguesslabel = new JLabel("Number of Guesses (you have only 3 tries)");
        totalguesslabel.setSize(270,20);
        totalguesslabel.setLocation(50,40);



        guessbutton.setSize(100,30);
        guessbutton.setLocation(110,190);
        guessbutton.setBackground(Color.LIGHT_GRAY);
        buttonListener = new ButtonListener();
        guessbutton.addActionListener(buttonListener);

        c.add(totalguesslabel);
        c.add(trylabel);
        c.add(inputlabel);
        c.add(guess);
        c.add(totalguess);
        c.add(guessbutton);

        totalguess.setEditable(false);
        setTitle("Guessing game");
        setSize(400,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(guess.getText());
            count=count+1;
            if(a<rand)
            {
                trylabel.setText(a+" is low, try again!!");
            }
            else if(a>rand)
            {
                trylabel.setText(a+" is high, try again!!");
            }
            else
            {
                trylabel.setText("Your guess is correct, You win!!");
                guess.setEditable(false);
            }

            guess.requestFocus();
            guess.selectAll();
            totalguess.setText(count+"");
            if (count == 3)
            {
                trylabel.setText("Game over!");
                guess.setEditable(false);
                guessbutton.setEnabled(false);
            }
        }
    }

    public static void main(String[] args)
    {
        new Main();
    }
}