package com.prog2.week3.brocode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

class MyMenuBarFrame extends JFrame implements ActionListener {

    JMenuItem menuItemNew;
    JMenuItem menuItemOpen;
    JMenuItem menuItemSave;
    JMenuItem menuItemExit;    

    public MyMenuBarFrame() {
        this.setTitle("JMenuBar Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(480, 340); // set the size of the frame
        this.setLayout(null); // set layout to null for absolute positioning

        // create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // create a JMenu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");

        menuItemNew  = new JMenuItem("New");
        menuItemOpen = new JMenuItem("Open");
        menuItemSave = new JMenuItem("Save");
        menuItemExit = new JMenuItem("Exit");

        // add action listeners to the menu items
        menuItemNew .addActionListener(this);
        menuItemOpen.addActionListener(this);
        menuItemSave.addActionListener(this);
        menuItemExit.addActionListener(e -> System.exit(0)); // Exit the application when Exit is clicked

        // set icons for the menu items
        menuItemNew .setIcon(new ImageIcon("src/com/prog2/week3/brocode/iconY.png"));
        menuItemExit.setIcon(new ImageIcon("src/com/prog2/week3/brocode/iconX.png"));
        
        // set mnemonics for the menus
        fileMenu.setMnemonic(KeyEvent.VK_F); // Set mnemonic for File (Alt + F) 
        editMenu.setMnemonic(KeyEvent.VK_E); // Set mnemonic for Edit (Alt + E) 
        viewMenu.setMnemonic(KeyEvent.VK_V); // Set mnemonic for View (Alt + V) 
        helpMenu.setMnemonic(KeyEvent.VK_H); // Set mnemonic for Help (Alt + H) 
        
        // set mnemonics (shortcuts) for the menu items
        menuItemNew .setMnemonic(KeyEvent.VK_N); // Set mnemonic for New (N)
        menuItemOpen.setMnemonic(KeyEvent.VK_O); // Set mnemonic for Open (O)
        menuItemSave.setMnemonic(KeyEvent.VK_S); // Set mnemonic for Save (S)
        menuItemExit.setMnemonic(KeyEvent.VK_X); // Set mnemonic for Exit (x)
        
        // set accelerators (keyboard shortcuts) for the menu items
        menuItemNew .setAccelerator(KeyStroke.getKeyStroke("control N")); // Ctrl + N
        menuItemOpen.setAccelerator(KeyStroke.getKeyStroke("control O")); // Ctrl + O
        menuItemSave.setAccelerator(KeyStroke.getKeyStroke("control S")); // Ctrl + S
        menuItemExit.setAccelerator(KeyStroke.getKeyStroke("control X")); // Ctrl + X


        // Add items to the File menu
        fileMenu.add(menuItemNew);
        fileMenu.add(menuItemOpen);
        fileMenu.add(menuItemSave);
        fileMenu.addSeparator(); // add a separator
        fileMenu.add(menuItemExit);

        // Add items to the Edit menu
        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Paste"));

        // Add items to the View menu
        viewMenu.add(new JCheckBoxMenuItem("Show Toolbar"));
        viewMenu.add(new JCheckBoxMenuItem("Show Status Bar"));

        // Add items to the Help menu
        helpMenu.add(new JMenuItem("About"));

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        this.setJMenuBar(menuBar);

        this.setVisible(true); // make the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItemNew) {
            System.out.println("New File Created");
        } else if (e.getSource() == menuItemOpen) {
             System.out.println("File Opened");
        } else if (e.getSource() == menuItemSave) {
            System.out.println("File Saved");
        } else if (e.getSource() == menuItemExit) {
            System.exit(0); // Exit the application when Exit is clicked
        }
    }
}

public class Gui_17_JMenuBar {
    public static void main(String[] args) {
        new MyMenuBarFrame(); // create an instance of MyMenuBarFrame to display the GUI
    }
}
