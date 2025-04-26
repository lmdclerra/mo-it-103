package com.prog2.week3.brocode;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

// JLabel is a GUI component that displays area for a string of text, an image, or both.
// YouTube reference: https://youtu.be/Kmgo00avvEw
public class Gui_02_Labels {

    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("src/com/prog2/week3/brocode/dude.png"); // Load an image icon
        JLabel label = new JLabel(); // Create a label 
        label.setText("Bro, do you even code?");
        label.setIcon(image); // Set the icon of the label
        label.setHorizontalTextPosition(JLabel.CENTER); // Set the text position to center
        label.setVerticalTextPosition(JLabel.BOTTOM); // Set the text position to center
        label.setForeground(Color.CYAN); // Set the text color to green
        label.setFont(new Font("MV Boli", Font.BOLD, 40)); // Set the font size to 14
        label.setIconTextGap(-40); 
        label.setBackground(Color.BLACK); 
        label.setOpaque(true); // Make the label opaque to see the background color
        // Create a border with red color and thickness of 3
        Border borderFactory = BorderFactory.createLineBorder(Color.CYAN, 3); 
        label.setBorder(borderFactory); // Set the border of the label
        label.setHorizontalAlignment(JLabel.CENTER); // Set the horizontal alignment of the label to center
        label.setVerticalAlignment(JLabel.CENTER);
        // label.setBounds(10, 10, 600, 400); // prerequisite: frame.setLayout(null); 

        JFrame frame = new JFrame(); // Create a new JFrame
        // frame.setLayout(null); // Set the layout of the frame to null, default is BorderLayout
        // frame.setSize(800, 600); // Set the size of the frame        
        frame.setTitle("JLabel Demonostration"); // Set the title of the frame
        frame.setIconImage(new ImageIcon("src/com/prog2/week3/brocode/myIcon.png").getImage()); // Set the icon of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
        frame.getContentPane().setBackground(Color.WHITE); // Set the background color of the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); // Make the frame visible
        frame.add(label); // Add the label to the frame
        frame.pack(); // Pack the frame to fit the components
    }
}
