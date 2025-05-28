package com.prog2.week3.brocode;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

class MyProgressBarFrame extends JFrame  {

    JPanel panel;
    JProgressBar progressBar;

    public MyProgressBarFrame() {
        this.setTitle("JProgressBar Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(480, 340); // set the size of the frame
        this.setLayout(null); // set layout to null for absolute positioning

        panel = new JPanel();
        panel.setBounds(20, 20, 460, 300); // set bounds for the panel
        panel.setLayout(null); // set layout to null for absolute positioning
        
        progressBar = new JProgressBar(0, 100); // create a progress bar with min 0 and max 100
        progressBar.setFont(new Font("Consolas", Font.BOLD, 14)); // set the font for the progress bar
        progressBar.setStringPainted(true); // paint the string on the progress bar
        progressBar.setBounds(50, 100, 300, 30); // set bounds for the progress bar
        progressBar.setString("Loading..."); // set the initial string for the progress bar
        progressBar.setValue(50); // set the initial value of the progress bar
        progressBar.setBackground(Color.BLACK); // set the background color of the progress bar
        progressBar.setForeground(Color.GREEN); // set the foreground color of the progress bar
        
        

        
        panel.add(progressBar); // add the progress bar to the panel
        this.add(panel); // add the panel to the frame

        this.setVisible(true); // make the frame visible

        updateProgress(); // call the method to update the progress
    }

    // Simulate progress update (this could be replaced with actual logic)
    public void updateProgress() {
        int value = 0; // initialize the value

        while (value <= 100) { // loop until the value reaches 100
            try {
                Thread.sleep(100); // sleep for 100 milliseconds to simulate progress
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++value; // increment the value by 10
            progressBar.setValue(value); // update the value of the progress bar
        }
        progressBar.setString("Completed!"); // set the string to indicate completion
    }
}

// TODO https://youtu.be/Kmgo00avvEw?t=9670
public class Gui_16_JProgressBar {

    public static void main(String[] args) {
        new MyProgressBarFrame(); // create an instance of the frame
    }
}
