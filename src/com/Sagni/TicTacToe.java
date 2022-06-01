package com.Sagni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.lang.Thread.sleep;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame f = new JFrame();
    JPanel tit_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel label =  new JLabel();
    JButton[] buttons = new JButton[9];
    boolean Player1;
  public TicTacToe(){
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(800,800);
      f.getContentPane().setBackground(new Color(50,50,50));
      f.setLayout(new BorderLayout());
      f.setVisible(true);

      label.setBackground(new Color(25,25,25));
      label.setForeground(new Color(25,225,0));
      label.setFont(new Font("Ink Free",Font.BOLD,75));
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setText("Tic-Tac-Toe");
      label.setOpaque(true);

      tit_panel.setLayout(new BorderLayout());
      tit_panel.setBounds(0,0,800,100);

      button_panel.setLayout(new GridLayout(3,3));
      button_panel.setForeground(new Color(150,150,150));

      for(int i=0;i<9;i++){
           buttons[i] = new JButton();
           button_panel.add(buttons[i]);
           buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
           buttons[i].setFocusable(false);
           buttons[i].addActionListener(this);
      }


      tit_panel.add(label);
      f.add(tit_panel,BorderLayout.NORTH);
      f.add(button_panel);
 for(int i=0;i<9;i++){
      if (buttons[i].getText() == "X") {
          if (buttons[i].getText() == "O") {
              gameOver();
          }
      }
      }

      firstTurn();


  }
    @Override
    public void actionPerformed(ActionEvent e) {
             for(int i= 0;i<9;i++){


                 if(e.getSource()==buttons[i]){
                     if(Player1){
                         if(buttons[i].getText()==""){
                             buttons[i].setForeground(new Color(255,0,0));
                             buttons[i].setText("X");
                             Player1=false;
                             label.setText("O turn");
                             check();
                           //  gameOver();
                         }
                     }
                     else {
                         if(buttons[i].getText()==""){
                             buttons[i].setForeground(new Color(0, 0, 255));
                             buttons[i].setText("O");
                             Player1=true;
                             label.setText("X turn");
                             check();
                            // gameOver();
                             }
                         }
                     }

              //   else{
                    // for(int i = 0; i < 9;i++) {
                        /* if (buttons[i].getText() == "X") {
                             if(buttons[i].getText() == "O") {
                                  gameOver();
                             }
                             }
                     }*/
                  }

             }



    public void firstTurn() {
      try {
          Thread.sleep(2000);
      }catch (InterruptedException e){
          e.printStackTrace();
      }
      if(random.nextInt(2)==0) {
          Player1 = true;
          label.setText("X turn");
      }
          else {
              Player1 = false;
              label.setText("O turn");
      }
    }
    public void check(){
                   //xwins
         if(     (buttons[0].getText()=="X")&&
                 (buttons[1].getText()=="X")&&
                 (buttons[2].getText()=="X")
          ){
             xWins(0,1,2);
       }
        if(     (buttons[3].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[5].getText()=="X")
        ){
            xWins(3,4,5);
        }
        if(     (buttons[6].getText()=="X")&&
                (buttons[7].getText()=="X")&&
                (buttons[8].getText()=="X")
        ){
            xWins(6,7,8);
        }
        if(     (buttons[0].getText()=="X")&&
                (buttons[3].getText()=="X")&&
                (buttons[6].getText()=="X")
        ){
            xWins(0,3,6);
        }
        if(     (buttons[1].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[7].getText()=="X")
        ){
            xWins(1,4,7);
        }
        if(     (buttons[2].getText()=="X")&&
                (buttons[5].getText()=="X")&&
                (buttons[8].getText()=="X")
        ){
            xWins(2,5,8);
        }
        if(     (buttons[0].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[8].getText()=="X")
        ){
            xWins(0,4,8);
        }
        if(     (buttons[2].getText()=="X")&&
                (buttons[4].getText()=="X")&&
                (buttons[6].getText()=="X")
        ){
            xWins(2,4,6);
        }
                //owins
        if(     (buttons[0].getText()=="O")&&
                (buttons[1].getText()=="O")&&
                (buttons[2].getText()=="O")
        ){
            oWins(0,1,2);
        }
        if(     (buttons[3].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[5].getText()=="O")
        ){
            oWins(3,4,5);
        }
        if(     (buttons[6].getText()=="O")&&
                (buttons[7].getText()=="O")&&
                (buttons[8].getText()=="O")
        ){
            oWins(6,7,8);
        }
        if(     (buttons[0].getText()=="O")&&
                (buttons[3].getText()=="O")&&
                (buttons[6].getText()=="O")
        ){
            oWins(0,3,6);
        }
        if(     (buttons[1].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[7].getText()=="O")
        ){
            oWins(1,4,7);
        }
        if(     (buttons[2].getText()=="O")&&
                (buttons[5].getText()=="O")&&
                (buttons[8].getText()=="O")
        ){
            oWins(2,5,8);
        }
        if(     (buttons[0].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[8].getText()=="O")
        ){
            oWins(0,4,8);
        }
        if(     (buttons[2].getText()=="O")&&
                (buttons[4].getText()=="O")&&
                (buttons[6].getText()=="O")
        ){
            oWins(2,4,6);
        }
        gameOver();
    }
    public void xWins(int a, int b, int c){
       buttons[a].setBackground(Color.green);
       buttons[b].setBackground(Color.green);
       buttons[c].setBackground(Color.green);
        for(int i=0; i<9;i++){
            buttons[i].setEnabled(false);
        }
        label.setText("X Wins");
       /* try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/
       new WinnerX();

    }
    public void oWins(int a,int b,int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        for(int i=0; i<9;i++){
            buttons[i].setEnabled(false);

        }
        label.setText("O Wins");
        new WinnerO();
    }

    public void gameOver(){
    /*  for(int i = 0; i < 9;i++) {
          if (buttons[i].getText() == "X") {
                if(buttons[i].getText() == "O"){

                    JFrame f = new JFrame();
                    f.setSize(700,600);
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                }
          }
      }*/
    }
}
