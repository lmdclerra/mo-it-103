package com.prog2.week3.brocode;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyBorderLayout {
    // This class sets up a GUI with a BorderLayout and adds buttons to each region of the layout

    public MyBorderLayout() {
        // Constructor to set up the GUI
        JFrame frame = new JFrame("Border Layout Example"); // Creates a new JFrame with the title "Border Layout Example"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets the default close operation for the frame
        frame.setSize(500, 500); // Sets the size of the frame
        frame.setLayout(new BorderLayout()); // Sets the layout manager to BorderLayout

        // Add buttons to each region of the BorderLayout
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setVisible(true); // Makes the frame visible
    }
}

// TODO: YouTube Reference: https://youtu.be/Kmgo00avvEw?t=3411
public class Gui_05_BorderLayout {

    public static void main(String[] args) {
        new MyBorderLayout(); // Creates an instance of the MyBorderLayout class, which sets up the GUI
    }
}
