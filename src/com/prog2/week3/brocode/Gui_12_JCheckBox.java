package com.prog2.week3.brocode;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCheckBoxFrame extends JFrame implements ActionListener {
    // JFrame is a top-level container that provides a window on the screen
    // It is used to create a GUI application; It is a part of the Swing library

    JCheckBox checkBox; // Declare a JCheckBox object
    JButton button; // Declare a JButton object
    ImageIcon xIcon; // Declare an ImageIcon object
    ImageIcon yIcon; // Declare an ImageIcon object

    MyCheckBoxFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        this.setTitle("JCheckBox Example"); // Set the title of the window
        this.setLayout(new FlowLayout()); // Set the layout manager to FlowLayout
        this.setLocationRelativeTo(null);

        xIcon = new ImageIcon("src/com/prog2/week3/brocode/iconX.png"); // Create a new ImageIcon object
        yIcon = new ImageIcon("src/com/prog2/week3/brocode/iconY.png"); // Create a new ImageIcon object

        button = new JButton("Submit"); // Create a new JButton object
        button.addActionListener(this); // Add an action listener to the button

        checkBox = new JCheckBox(); // Create a new JCheckBox object
        checkBox.setText("I am not a robot -- I am a checkbox"); // Set the text of the checkbox
        checkBox.setFocusable(false); // Disable focus on the checkbox - remove also line around the checkbox
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 20)); // Set the font of the checkbox
        // checkBox.setSelected(true); // Set the checkbox to be selected by default
        checkBox.setIcon(xIcon); // Set the icon of the checkbox when it is not selected
        checkBox.setSelectedIcon(yIcon); // Set the icon of the checkbox when it is selected

        this.add(checkBox); // Add the checkbox to the window
        this.add(button); // Add the button to the window

        this.pack(); // Pack the components in the window
        this.setVisible(true); // Make the window visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) { // Check if the button was clicked
            System.out.println("Is checkbox selected? : " + checkBox.isSelected()); // Print the state of the checkbox to the console
            checkBox.setSelected(!checkBox.isSelected()); // Toggle the state of the checkbox
            System.out.println("Now toggling it to : " + checkBox.isSelected()); // Print the state of the checkbox to the console
        }
    }
}

// source https://youtu.be/Kmgo00avvEw?t=7597
public class Gui_12_JCheckBox {
    // JCheckBox is a GUI component that allows the user to select or deselect an option
    // It is a part of the Swing library
    // It is used to create a checkbox in a GUI application

    public static void main(String[] args) {
        new MyCheckBoxFrame(); // Create a new instance of MyCheckBoxFrame
    }
}
