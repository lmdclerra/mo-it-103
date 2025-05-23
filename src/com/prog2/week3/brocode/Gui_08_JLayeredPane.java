package com.prog2.week3.brocode;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JFrame;

public class Gui_08_JLayeredPane {
    // JLayeredPane is a container that allows stacking of components in layers, enabling overlapping and z-ordering of components.
    // It is useful for creating complex layouts where components need to be positioned on top of each other.
    // Each component can be assigned a layer, and the layers can be manipulated to change the visibility and order of the components.

    public static void main(String[] args) {
        MyTextFieldFrame frame = new MyTextFieldFrame(); // Create an instance of MyFrame
        frame.setTitle("JLayeredPane Example"); // Set the title of the window
        frame.setSize(400, 400); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation

        
        JLabel label_RED = new JLabel("Label 1"); // Create a Label
        label_RED.setOpaque(true); // Make the Label opaque to see the background color
        label_RED.setBackground(java.awt.Color.RED); // Set the background color of the Label to blue
        label_RED.setBounds(50, 50, 100, 100); // Set the position and size of the Label
        
        JLabel label_GREEN = new JLabel("Label 2"); // Create another Label
        label_GREEN.setOpaque(true); // Make the Label opaque to see the background color
        label_GREEN.setBackground(java.awt.Color.GREEN); // Set the background color of the second Label to red
        label_GREEN.setBounds(100, 100, 100, 100); // Set the position and size of the second Label
        
        JLabel label_BLUE = new JLabel("Label 3"); // Create a third Label
        label_BLUE.setOpaque(true); // Make the Label opaque to see the background color
        label_BLUE.setBackground(java.awt.Color.BLUE); // Set the background color of the third Label to green
        label_BLUE.setBounds(150, 150, 100, 100); // Set the position and size of the third Label
        
        JLayeredPane layeredPane = new JLayeredPane(); // Create a new JLayeredPane
        // layeredPane.setPreferredSize(new Dimension(400, 400)); // Set the preferred size of the layered pane
        layeredPane.setBounds(0, 0, 500, 500); // Set the position and size of the layered pane

        layeredPane.add(label_RED, Integer.valueOf(1)); // Add the Label to the layered pane with layer 1
        layeredPane.add(label_GREEN, Integer.valueOf(3)); // Add the second Label to the layered pane with layer 2
        layeredPane.add(label_BLUE, Integer.valueOf(2)); // Add the third Label to the layered pane with layer 3

        frame.add(layeredPane); // Add the layered pane to the frame
        frame.setVisible(true); // Make the window visible
    }
    // The MyFrame class is assumed to be defined in the same package and is responsible for creating the JFrame and setting its properties.
}
