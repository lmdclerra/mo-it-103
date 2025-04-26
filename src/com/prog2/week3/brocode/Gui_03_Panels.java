package com.prog2.week3.brocode;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// YouTube reference: https://youtu.be/Kmgo00avvEw?t=1811
public class Gui_03_Panels {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("src/com/prog2/week3/brocode/myIcon.png"); // Create an ImageIcon from the image file

        JLabel label = new JLabel(); // Create a new JLabel
        label.setText("my Icon"); // Set the text of the label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set the horizontal text position to center
        label.setVerticalTextPosition(JLabel.BOTTOM); // Set the vertical text position to bottom
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel(); // Create a new JPanel
        redPanel.setBackground(new Color(0xff0000)); // Set the background color to red;
        redPanel.setBounds(0, 0, 250, 250); // Set the position and size of the panel

        JPanel greenPanel = new JPanel(); // Create a new JPanel
        greenPanel.setBackground(new Color(0x74b900)); // Set the background color to green;
        greenPanel.setBounds(250, 0, 250, 250); // Set the position and size of the panel

        JPanel bluePanel = new JPanel(); // Create a new JPanel
        bluePanel.setBackground(new Color(0x3e57de)); // Set the background color to blue;
        bluePanel.setBounds(0, 250, 250, 250); // Set the position and size of the panel

        JPanel goldPanel = new JPanel(); // Create a new JPanel
        goldPanel.setBackground(new Color(0xf3ca25)); // Set the background color to gold;
        goldPanel.setBounds(250, 250, 250, 250); // Set the position and size of the panel
        goldPanel.setLayout(new BorderLayout()); // Set the layout of the panel to BorderLayout
        
        // Create a new JFrame
        JFrame frame = new JFrame("Panel Demonstration");
        frame.setIconImage(icon.getImage()); // Set the icon of the frame to the image icon
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use null layout for absolute positioning
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
        
        frame.add(redPanel);   // Add the red panel to the frame
        frame.add(greenPanel); // Add the green panel to the frame
        frame.add(bluePanel);  // Add the blue panel to the frame
        goldPanel.add(label);
        frame.add(goldPanel);  // Add the gold panel to the frame
        
    }
}
