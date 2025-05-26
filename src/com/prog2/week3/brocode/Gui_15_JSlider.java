package com.prog2.week3.brocode;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// JSlider is a component that lets the user select a value from a range of values by 
// sliding a knob along a track; It can be used to adjust settings such as volume, brightness, or zoom level
// JSlider can be horizontal or vertical, and it can have tick marks, labels, and a major or minor spacing
// It can also be used to create a progress bar or a seek bar
class MySliderFrame extends JFrame implements ChangeListener {

    JPanel panel;
    JLabel label;
    JSlider slider;

    public MySliderFrame() {
        
        this.setTitle("JSlider Example");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(480, 340); // set the size of the frame
        this.setLayout(null); // set layout to null for absolute positioning4

        panel = new JPanel();
        panel.setBounds(20, 20, 460, 300); // set bounds for the panel
        panel.setLayout(null); // set layout to null for absolute positioning

        label = new JLabel("Volume: 50");
        label.setBounds(4, 0, 200, 30); // set bounds for the label

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50); // create a horizontal slider with min 0, max 100, and initial value 50
        // slider.setOrientation(JSlider.HORIZONTAL);
        // slider.setPreferredSize(new Dimension(200, 100)); // set preferred size for the slider
        slider.setFont(new Font("Consolas", Font.PLAIN, 14)); // set font for the slider
        slider.setBounds(0,30, 100, 200); // set bounds for the slider
        slider.setMajorTickSpacing(25); // set major tick spacing
        slider.setMinorTickSpacing(5); // set minor tick spacing
        slider.setPaintTicks(true); // paint the ticks
        slider.setPaintLabels(true); // paint the labels
        slider.addChangeListener(this); // add a change listener to the slider
        
        panel.add(label);
        panel.add(slider); // add the slider to the panel
        this.add(panel);

        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue(); // get the current value of the slider
        label.setText("Volume: " + value); // update the label with the current value
    }


}

// https://youtu.be/Kmgo00avvEw?t=8899
public class Gui_15_JSlider {    

    public static void main(String[] args) {
        new MySliderFrame();
    }
}
