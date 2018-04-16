package com.theironyard;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) { //repeat this 130 times.

            x++; //increments the x & y coordinates.
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(50); // slow it down a little (otherwise
                //you won't SEE it move).
            } catch (Exception ex) {
            }
        }
    }//close go() method

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0,0,this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }//close inner class
} // close outer class