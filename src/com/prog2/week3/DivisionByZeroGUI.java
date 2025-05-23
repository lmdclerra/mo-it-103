package com.prog2.week3;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DivisionByZeroGUI extends JFrame implements ActionListener {

    private JTextField dividendField;
    private JTextField divisorField;
    private JTextField resultField;

    public DivisionByZeroGUI() {
        super("Division Program");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create the UI components
        JLabel dividendLabel = new JLabel("Dividend:");
        JLabel divisorLabel  = new JLabel("Divisor:");
        JLabel resultLabel   = new JLabel("Result:");
        dividendField = new JTextField(); //dividendField.setMargin(new Insets(5, 5, 0, 0));
        divisorField  = new JTextField(); //divisorField .setMargin(new Insets(5, 5, 0, 0));
        resultField   = new JTextField(); //resultField  .setMargin(new Insets(5, 5, 0, 0));
        resultField.setEditable(false); //resultField  .setMargin(new Insets(5, 5, 0, 0));

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(this);

        // Add the components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4, 2, 5, 5));
        contentPane.add(dividendLabel);        contentPane.add(dividendField);
        contentPane.add(divisorLabel);        contentPane.add(divisorField);
        contentPane.add(resultLabel);        contentPane.add(resultField);
        contentPane.add(new JLabel());        contentPane.add(divideButton);

        // Set the window size and make it visible
        setVisible(true); // pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Divide")) {
            try {
                // Get the dividend and divisor from the text fields
                int dividend = Integer.parseInt(dividendField.getText());
                int divisor = Integer.parseInt(divisorField.getText());

                // Perform the division
                int result = dividend / divisor;

                // Display the result in the result field
                resultField.setText(Integer.toString(result));
            } catch (ArithmeticException ex) {
                resultField.setText("Division by zero!");
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input!");
            }
        }
    }

    public static void main(String[] args) {
        DivisionByZeroGUI gui = new DivisionByZeroGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
