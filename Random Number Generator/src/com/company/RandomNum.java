package com.company;

import javax.swing.*;
/**
import java.awt.*;
*/
import java.util.Random;

public class RandomNum {

    /**
    JFrame screen = new JFrame("RandomNUM");
    JPanel window = new JPanel(new FlowLayout());
    JOptionPane upperBound = new JOptionPane("Upper");
    JOptionPane lowerBound = new JOptionPane("Lower");
    JLabel label = new JLabel();
    */

    public void RandomNum() {
        /**
        window.add(label);

        int width = 1024;
        int height = width/16*10;

        screen.setSize(width,height);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(upperBound);
        window.add(lowerBound);
        */
        while(true) {
            try {
                String upper = JOptionPane.showInputDialog("Upper");
                //If user presses "cancel"
                if (upper == null) {
                    break;
                }
                String lower = JOptionPane.showInputDialog("Lower");
                //If user presses "cancel"
                if (lower == null) {
                    break;
                }
                //Upper bound included
                int upperInt = Integer.parseInt(upper) + 1;
                int lowerInt = Integer.parseInt(lower);
                Random rand = new Random();
                int returnInt = rand.nextInt(upperInt - lowerInt) + lowerInt;
                String returnMsg = "Your random number is: " + returnInt;

                JOptionPane.showMessageDialog(null, returnMsg);
                break;
            //Handling non-integer exceptions
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter an integer");
                continue;
            //Handling Illegal Bounds
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Upper must be less than lower");
                continue;
            }
        }
        System.exit(0);
        /**
        window.setBackground(Color.gray);
        screen.add(window);
        screen.setBackground(Color.GREEN);
        screen.setVisible(true);
         */
    }
}
