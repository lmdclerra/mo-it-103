package com.prog2.week3.brocode;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

    JFrame frame = new JFrame(); // Create a new JFrame object
    JLabel label = new JLabel("This is a new window"); // Create a new JLabel object

    public NewWindow() {
        label.setBounds(100, 100, 200, 50); // Set the position and size of the label
        label.setFont( new Font(null, Font.PLAIN, 25 ));
        label.setHorizontalAlignment(JLabel.CENTER); // Center the text in the label
        label.setFocusable(false); // Disable focus on the label
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        frame.setSize(400, 400); // Set the size of the frame
        frame.setLayout(null); // Set layout manager to null for absolute positioning
        frame.setLocationRelativeTo(null);
        frame.setTitle("New Window"); // Set the title of the frame
        frame.setVisible(true); // Make the frame visible
    }
}
