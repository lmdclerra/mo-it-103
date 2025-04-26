package com.prog2.week3.brocode;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButtonFrame extends JFrame implements ActionListener{

    JButton myButton; // Declares a JButton variable named myButton
    JButton lambdaButton; // Declares a JButton variable named lambdaButton

    public MyButtonFrame() {

        myButton = new JButton(); // Creates a new JButton instance
        myButton.setText("Click Me!"); // Sets the text of the button to "Click Me!"
        myButton.setBounds(175, 100, 150, 150); // Sets the position and size of the button (x, y, width, height)
        myButton.addActionListener(this);
        myButton.setFocusable(false); // Disables the focus on the button when clicked
        myButton.setIcon(new ImageIcon("src/com/prog2/week3/brocode/myIcon.png")); // Sets an icon for the button
        myButton.setHorizontalTextPosition(JButton.CENTER); // Sets the text position to center
        myButton.setVerticalTextPosition(JButton.BOTTOM); // Sets the text position to bottom  
        // myButton.setFont(new Font("Consolas", Font.PLAIN, 20)); // Sets the font of the button text      

        lambdaButton = new JButton("Lambda Button"); // Creates a new JButton instance with text "Click Me!"
        lambdaButton.setBounds(175, 270, 150, 50); // Sets the position and size of the button (x, y, width, height)
        lambdaButton.addActionListener(e -> System.out.println("You clicked the Lambda button!")); // Adds an action listener using a lambda expression
        // lambdaButton.addActionListener(e -> { // Adds an action listener using a lambda expression        

        // JFrame is a top-level container that provides a window on the screen
        this.setTitle("JFrame Demonstration & Icon"); // Sets the title of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Sets the layout manager to null, allowing for absolute positioning of components);
        this.setSize(500, 500); // Sets the width and height of the window
        this.setVisible(true); // Makes the window visible
        this.setLocationRelativeTo(null); // Centers the window on the screen

        ImageIcon icon = new ImageIcon("src/com/prog2/week3/brocode/myIcon.png"); // Path to the image file
        this.setIconImage(icon.getImage()); // Sets the icon of the window
        this.getContentPane().setBackground(Color.WHITE); // Sets the background color of the window

        this.add(myButton); // Adds the button to the window
        this.add(lambdaButton); // Adds the button to the window
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == myButton) { // Checks if the source of the event is myButton
            System.out.println("You clicked the button!"); // Prints a message to the console
        }
    }

}
