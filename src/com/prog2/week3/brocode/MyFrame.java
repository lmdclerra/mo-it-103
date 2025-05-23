package com.prog2.week3.brocode;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame() {
        
        this.setTitle("JFrame Demonstration & Icon"); // Sets the title of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); // Prevents resizing of the window
        this.setSize(420, 420); // Sets the width and height of the window
        this.setVisible(true); // Makes the window visible
        this.setLocationRelativeTo(null); // Centers the window on the screen

        ImageIcon icon = new ImageIcon("src/com/prog2/week3/brocode/myIcon.png"); // Path to the image file
        this.setIconImage(icon.getImage()); // Sets the icon of the window
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255)); // Sets the background color of the window
    }
}
