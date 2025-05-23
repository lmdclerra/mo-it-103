package com.prog2.week3.brocode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui_06_FlowLayout {
    // FlowLayout is a layout manager that arranges components in a left-to-right flow, much like lines of text in a paragraph.
    // It is the default layout manager for JPanel.
    // Components are added to the container in the order they are added, and they wrap to the next line when they reach the edge of the container.

    public static void main(String[] args) {
        MyTextFieldFrame frame = new MyTextFieldFrame(); // Create an instance of MyFrame
        frame.setTitle("FlowLayout Example"); // Set the title of the window
        frame.setSize(400, 400); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation

        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)); // Set the layout manager to FlowLayout
        
        JPanel panel = new JPanel(); // Create a new JPanel
        panel.setBackground(Color.LIGHT_GRAY); // Set the background color of the panel to light gray
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10)); // Set the layout manager for the panel to FlowLayout
        
        // Add components to the panel (e.g., buttons, labels, etc.)    
        panel.add(new JButton("Button 1")); // Add a button to the panel
        panel.add(new JButton("Button 2")); // Add another button to the panel  
        panel.add(new JButton("Button 3")); // Add a third button to the panel
        panel.add(new JButton("Button 4")); // Add a fourth button to the panel
        panel.add(new JButton("Button 5")); // Add a fifth button to the panel
        panel.add(new JButton("Button 6")); // Add a sixth button to the panel
        panel.add(new JButton("Button 7")); // Add a seventh button to the panel
        panel.add(new JButton("Button 8")); // Add an eighth button to the panel
        panel.add(new JButton("Button 9")); // Add a ninth button to the panel
        
        frame.add(panel); // Add the panel to the frame
        frame.setVisible(true); // Make the window visible
    }
    // The MyFrame class is assumed to be defined in the same package and is responsible for creating the JFrame and setting its properties.
}
