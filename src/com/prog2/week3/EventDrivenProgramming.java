package com.prog2.week3;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

/* YouTube reference upon construction https://youtu.be/5o3fMLPY7qY 
 * and https://introcs.cs.princeton.edu/java/15inout/GUI.java.html */
public class EventDrivenProgramming implements ActionListener {

    private int count = 0; // Counter to keep track of button clicks
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public EventDrivenProgramming() {
        // Constructor can be empty or used for initialization if needed
        frame  = new JFrame("Button Click Example");
        panel  = new JPanel();
        label  = new JLabel("Button clicked: " + count + " times");
        button = new JButton("Click Me!");
        
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // Set border for the panel
        panel.setLayout(new GridLayout(2, 1)); // Set layout manager for the panel
        panel.add(label); // Add label to the panel
        panel.add(button); // Add button to the panel
        
        button.addActionListener(this); // Register the action listener

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Event Driven Programming Example");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        new EventDrivenProgramming(); // Create an instance of EventDrivenProgramming to show the GUI
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // JOptionPane.showMessageDialog(null, "Hello, World!");
        count++; // Increment the counter each time the button is clicked
        label.setText("Button clicked: " + count + " times"); // Update the label text
    }
}
