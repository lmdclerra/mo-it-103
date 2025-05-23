package com.prog2.week3.brocode;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyBorderLayout {
    // This class sets up a GUI with a BorderLayout and adds buttons to each region of the layout

    public MyBorderLayout() {
        // Constructor to set up the GUI
        JFrame frame = new JFrame("Border Layout Example"); // Creates a new JFrame with the title "Border Layout Example"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets the default close operation for the frame
        frame.setSize(800, 600); // Sets the size of the frame
        frame.setLayout(new BorderLayout(10, 10)); // Sets the layout manager to BorderLayout
        frame.setLocationRelativeTo(null); // Centers the frame on the screen

        // Add buttons to each region of the BorderLayout
        /* frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER); */
        // Add buttons to each region of the BorderLayout

        JPanel panelHeader  = new JPanel(); panelHeader .setBackground(Color.RED   ); panelHeader .setPreferredSize(new Dimension(100, 50));
        JPanel panelNavbar  = new JPanel(); panelNavbar .setBackground(Color.YELLOW); panelNavbar .setPreferredSize(new Dimension(100, 50));
        JPanel panelContent = new JPanel(); panelContent.setBackground(Color.GRAY  ); panelContent.setPreferredSize(new Dimension(100, 50));
        JPanel panelRight   = new JPanel(); panelRight  .setBackground(Color.BLUE  ); panelRight  .setPreferredSize(new Dimension(100, 50));
        JPanel panelFooter  = new JPanel(); panelFooter .setBackground(Color.GREEN ); panelFooter .setPreferredSize(new Dimension(100, 50));

        // --------------------------------------------- sub-panels for the content panel ---------------------------------------------
        JPanel panelContentN = new JPanel(); panelContentN.setBackground(Color.GREEN ); panelContentN.setPreferredSize(new Dimension(100, 50));
        JPanel panelContentW = new JPanel(); panelContentW.setBackground(Color.BLUE  ); panelContentW.setPreferredSize(new Dimension(100, 50));
        JPanel panelContentC = new JPanel(); panelContentC.setBackground(Color.WHITE ); panelContentC.setPreferredSize(new Dimension(100, 50));
        JPanel panelContentE = new JPanel(); panelContentE.setBackground(Color.ORANGE); panelContentE.setPreferredSize(new Dimension(100, 50));
        JPanel panelContentS = new JPanel(); panelContentS.setBackground(Color.RED   ); panelContentS.setPreferredSize(new Dimension(100, 50));

        panelContent.setLayout(new BorderLayout(10, 10)); // Sets the layout manager for the content panel to BorderLayout
        
        panelContent.add(panelContentN, BorderLayout.NORTH);
        panelContent.add(panelContentW, BorderLayout.WEST);
        panelContent.add(panelContentC, BorderLayout.CENTER);
        panelContent.add(panelContentE, BorderLayout.EAST);
        panelContent.add(panelContentS, BorderLayout.SOUTH);
        // --------------------------------------------- sub-panels for the content panel ---------------------------------------------

        frame.add(panelHeader,  BorderLayout.NORTH );
        frame.add(panelNavbar,  BorderLayout.WEST  );
        frame.add(panelContent, BorderLayout.CENTER);
        frame.add(panelRight,   BorderLayout.EAST  );
        frame.add(panelFooter,  BorderLayout.SOUTH );

        frame.setVisible(true); // Makes the frame visible
    }
}

public class Gui_05_BorderLayout {

    public static void main(String[] args) {
        new MyBorderLayout(); // Creates an instance of the MyBorderLayout class, which sets up the GUI
    }
}
