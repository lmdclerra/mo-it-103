package com.prog2.week3.brocode;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

// JComboBox is a component that combines a button or editable field and a drop-down list
class MyComboBoxFrame extends JFrame implements ActionListener{

    JComboBox<String> comboBox;

    public MyComboBoxFrame() {
            
        this.setTitle("JComboBox Example");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        // create a JComboBox with some items
        String[] items = { "Pizza", "Hamburger", "Hotdog" };
        // note: if you need to use a primitive type, you can use the wrapper class
        // Integer[] items = { 1, 2, 3 }; // for example, if you want to use Integer type

        comboBox = new JComboBox<>(items);
        comboBox.setSelectedIndex(0); // set the default selected item
        comboBox.addActionListener(this); // add action listener to the JComboBox

        // other methods we can use with JComboBox
        // comboBox.setEditable(true); // make the JComboBox editable
        // comboBox.setMaximumRowCount(3); // set the maximum number of rows to display in the drop-down list
        // comboBox.setSelectedItem("Pizza"); // set the selected item by value
        // comboBox.addItem("Sushi"); // add an item to the JComboBox
        // comboBox.removeItem("Pizza"); // remove an item from the JComboBox
        // comboBox.removeItemAt(0); // remove an item at a specific index
        comboBox.insertItemAt("Sushi", 1); // insert an item at a specific index
        // comboBox.getSelectedItem(); // get the selected item
        // comboBox.getSelectedIndex(); // get the index of the selected item
        comboBox.setSelectedIndex(2); // set the selected item by index
        // comboBox.removeAllItems(); // remove all items from the JComboBox
        
        this.add(comboBox); // add the JComboBox to the frame
        
        // this.pack(); // pack() method is used to size the frame so that all its contents are at or above their preferred sizes
        this.setSize(300, 100); // set the size of the frame
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            String selectedItem = (String) comboBox.getSelectedItem();
            System.out.println(selectedItem + " is selected");
        }
    }
}

// https://youtu.be/Kmgo00avvEw?t=8306
public class Gui_14_JComboBox {
    public static void main(String[] args) {
        new MyComboBoxFrame();
    }
}
