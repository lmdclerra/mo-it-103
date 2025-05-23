package com.prog2.week3.brocode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame(); // Create a new JFrame object
    JButton button = new JButton("New Window"); // Create a new JButton object

    // Constructor to set up the frame and button
    public LaunchPage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        frame.setSize(400, 400); // Set the size of the frame
        frame.setLayout(null); // Set layout manager to null for absolute positioning
        frame.setLocationRelativeTo(null);
        frame.setTitle("Launch Page"); // Set the title of the frame
        frame.setVisible(true); // Make the frame visible

        button.setBounds(100, 100, 200, 50); // Set the position and size of the button
        button.setFocusable(false); // Disable focus on the button
        button.addActionListener(this);
        
        frame.add(button); // Add the button to the frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) { // Check if the button was clicked
            frame.dispose(); // Close the current frame
            new NewWindow(); // Create a new instance of the NewWindow class
        }
    }
}
