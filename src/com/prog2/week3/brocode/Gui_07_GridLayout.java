package com.prog2.week3.brocode;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Gui_07_GridLayout {
    // GridLayout is a layout manager that arranges components in a grid of cells, with each cell having the same size.
    // It is useful for creating forms or tables where components need to be aligned in rows and columns.
    // The number of rows and columns can be specified when creating the GridLayout object.

    public static void main(String[] args) {
        MyTextFieldFrame frame = new MyTextFieldFrame(); // Create an instance of MyFrame
        frame.setTitle("GridLayout Example"); // Set the title of the window
        frame.setSize(400, 400); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation

        frame.setLayout(new GridLayout(3, 3, 10, 10)); // Set the layout manager to GridLayout with 3 rows and 3 columns

        // Add components to the frame (e.g., buttons, labels, etc.)
        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Button " + i)); // Add buttons to the grid layout
        }

        frame.setVisible(true); // Make the window visible
    }
    // The MyFrame class is assumed to be defined in the same package and is responsible for creating the JFrame and setting its properties.
}
