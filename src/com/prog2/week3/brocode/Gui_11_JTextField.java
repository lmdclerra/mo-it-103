package com.prog2.week3.brocode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyTextFieldFrame extends JFrame implements ActionListener {
    // JFrame is a top-level container that provides a window on the screen
    // It is used to create a GUI application; It is a part of the Swing library

    JButton button; // Declare a JButton object
    JTextField textField; // Declare a JTextField object

    MyTextFieldFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        this.setTitle("JTextField Example"); // Set the title of the window
        this.setLayout(new FlowLayout()); // Set the layout manager to FlowLayout
        this.setLocationRelativeTo(null);

        button = new JButton("Submit"); // Create a new JButton object
        button.addActionListener(this); // Add an action listener to the button
        button.setPreferredSize(new Dimension(100, 40)); // Set the preferred size of the button

        textField = new JTextField(); // Create a new JTextField object
        textField.setPreferredSize(new Dimension(250, 40)); // Set the preferred size of the text field
        textField.setFont(new Font("Consolas", Font.PLAIN, 16)); // Set the font of the text field
        textField.setForeground(new java.awt.Color(0x00FF00)); // Set the text color of the text field
        textField.setBackground(new java.awt.Color(0, 0, 0)); // Set the background color of the text field
        textField.setCaretColor(Color.WHITE); // Set the caret color of the text field
        // textField.setText("Username"); // Set the default text of the text field

        this.add(button); // Add the button to the window
        this.add(textField); // Add the text field to the window

        this.pack(); // Pack the components in the window
        this.setVisible(true); // Make the window visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) { // Check if the button was clicked
            button.setEnabled(false); // Disable the button
            button.setText("Loading..."); // Change the text of the button
            textField.setEditable(false); // Disable editing of the text field
            System.out.println(textField.getText()); // Print the text to the console
        }
    }
}

// TODO: https://youtu.be/Kmgo00avvEw?t=6913
public class Gui_11_JTextField {
    public static void main(String[] args) {
        // JTextField is a GUI component that allows the user to enter text
        // It is a single-line text input field
        // It is used to get input from the user in a GUI application

        new MyTextFieldFrame(); // Create a new instance of MyFrame
        // This will create a new window with a button and a text field        

    }
    // JTextField is a part of the Swing library
}
