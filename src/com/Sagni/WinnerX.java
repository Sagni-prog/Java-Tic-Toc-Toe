package com.Sagni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinnerX {
    JLabel jLabel = new JLabel();
    JFrame fr = new JFrame();
    JButton but = new JButton();
      public WinnerX(){
          fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          fr.setSize(800,800);
          fr.setBackground(new Color(50,50,50));
          fr.setLayout(new BorderLayout());

         // jLabel.setAlignmentX(Label.CENTER_ALIGNMENT);
          jLabel.setLocation(100,300);
          jLabel.setText("Congratulations X you win");
          jLabel.setBackground(new Color(82, 232, 13));
          jLabel.setFont(new Font("Ink Free",Font.BOLD,30));
          but = new JButton("New Game");
          but.setBounds(270,300,150,40);
          but.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new TicTacToe();
              }
          });
          fr.add(but);
          fr.add(jLabel);
          fr.setVisible(true);
      }
}
