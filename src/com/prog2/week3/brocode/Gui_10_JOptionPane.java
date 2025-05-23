package com.prog2.week3.brocode;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui_10_JOptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.WARNING_MESSAGE);   
        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World", "Title", JOptionPane.INFORMATION_MESSAGE, null);

        for (int i = 0; i < 4; ++i) {
            int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?",
                "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println(answer);
            // 0 = YES, 1 = NO, 2 = CANCEL, -1 = CLOSED
            // logic base on the answer
            switch (answer) {
                case JOptionPane.YES_OPTION:
                    System.out.println("You are a bro!");
                    break;
                case JOptionPane.NO_OPTION:
                    System.out.println("You are not a bro!");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    System.out.println("You are a bro, but you are not sure!");
                    break;
                default:
                    System.out.println("You closed the dialog!");
            }
        }

        String name = JOptionPane.showInputDialog(null, 
            "What is your name?", "Title", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Hello " + name + "!");

        ImageIcon icon = new ImageIcon("src/com/prog2/week3/brocode/smile64px.png");
        Object[] options = {"Yes", "No", "Maybe", "I don't know"};
        int result = JOptionPane.showOptionDialog(null, "You're awesome", "Secret message", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);        
        System.out.println(result); // 0 = YES, 1 = NO, 2 = CANCEL, -1 = CLOSED
    }
}
