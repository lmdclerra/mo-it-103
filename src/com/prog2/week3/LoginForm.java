package com.prog2.week3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/* Java GUI: Full Course (FREE) by Bro Code
YouTube Reference: https://youtu.be/Kmgo00avvEw */
public class LoginForm {

    // Constructor to set up the login form
    public LoginForm() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(frame);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(15);

        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(15);

        JButton btnLogin = new JButton("Login");

        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(lblUsername, gbc);

        gbc.gridx = 1;
        frame.add(txtUsername, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(lblPassword, gbc);

        gbc.gridx = 1;
        frame.add(txtPassword, gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        frame.add(btnLogin, gbc);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if ("admin".equals(username) && "pass".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the LoginForm class to display the login form
        new LoginForm();
    }
}
