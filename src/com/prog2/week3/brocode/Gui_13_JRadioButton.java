package com.prog2.week3.brocode;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class MyRadioButtonFrame extends JFrame implements ActionListener {
    
    JRadioButton btnPizza;
    JRadioButton btnHamburger;
    JRadioButton btnHotdog;
    ImageIcon iconPizza;
    ImageIcon iconHamburger;
    ImageIcon iconHotdog;

    public MyRadioButtonFrame() {
        
        setTitle("JRadioButton Example");
        
        // setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // create radio buttons
        btnPizza = new JRadioButton("Pizza");
        btnHamburger = new JRadioButton("Hamburger");
        btnHotdog = new JRadioButton("Hotdog");

        // load icons for the radio buttons
        iconPizza = new ImageIcon("src/com/prog2/week3/brocode/iconPizza.png");
        iconHamburger = new ImageIcon("src/com/prog2/week3/brocode/iconHamburger.png");
        iconHotdog = new ImageIcon("src/com/prog2/week3/brocode/iconHotdog.png");
        
        // set icons for the radio buttons
        btnPizza.setIcon(iconPizza);
        btnHamburger.setIcon(iconHamburger);
        btnHotdog.setIcon(iconHotdog);

        // group the radio buttons together
        ButtonGroup group = new ButtonGroup();
        group.add(btnPizza);
        group.add(btnHamburger);
        group.add(btnHotdog);

        // add the radio buttons to the frame
        this.add(btnPizza);
        this.add(btnHamburger);
        this.add(btnHotdog);

        this.pack(); // pack() method is used to size the frame so that all its contents are at or above their preferred sizes
        setVisible(true);

        btnPizza.addActionListener(this);
        btnHamburger.addActionListener(this);
        btnHotdog.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPizza) {
            System.out.println("Pizza is selected");
        } else if (e.getSource() == btnHamburger) {
            System.out.println("Hamburger is selected");
        } else if (e.getSource() == btnHotdog) {
            System.out.println("Hotdog is selected");
        }
    }
}

// TODO https://youtu.be/Kmgo00avvEw?t=7681
public class Gui_13_JRadioButton {
    // Radio buttons are used when you want to select one option from a group of options
    // You can only select one radio button at a time
    // If you select another radio button, the previous one will be deselected

    // To create a radio button, we use the JRadioButton class
    // We can add radio buttons to a ButtonGroup to group them together

    // Example:
    // JRadioButton radioButton1 = new JRadioButton("Option 1");
    // JRadioButton radioButton2 = new JRadioButton("Option 2");
    // ButtonGroup group = new ButtonGroup();
    // group.add(radioButton1);
    // group.add(radioButton2);

    public static void main(String[] args) {
        new MyRadioButtonFrame();
    }
}
