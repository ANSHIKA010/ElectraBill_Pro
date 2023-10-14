package com.attech.electrabillpro.auth;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Signup extends JFrame {

    Signup(){
        setBounds(450, 150, 700, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(30, 10, 650, 320);
        panel.setBorder(new TitledBorder(new LineBorder(Color.cyan), "Create Account", TitledBorder.LEADING, TitledBorder.TOP, null, Color.cyan));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(Color.BLACK);
        add(panel);

        JLabel heading = new JLabel("Create Account");
        heading.setBounds(60, 50, 150, 20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(heading);


        //Form Fields
        Choice accountType= new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(220, 50, 150, 20);
        panel.add(accountType);

        JLabel meterLabel= new JLabel("Meter Number");
        meterLabel.setBounds(60, 90, 150, 20);
        meterLabel.setForeground(Color.GRAY);
        meterLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(meterLabel);

        JTextField meter = new JTextField();
        meter.setBounds(220, 90, 150, 20);
        panel.add(meter);

        JLabel uNameLabel= new JLabel("UserName");
        uNameLabel.setBounds(60, 130, 150, 20);
        uNameLabel.setForeground(Color.GRAY);
        uNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(uNameLabel);

        JTextField username = new JTextField();
        username.setBounds(220, 130, 150, 20);
        panel.add(username);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(60, 170, 150, 20);
        nameLabel.setForeground(Color.GRAY);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(nameLabel);

        JTextField name = new JTextField();
        name.setBounds(220, 170, 150, 20);
        panel.add(name);

        JLabel passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(60, 210, 150, 20);
        passwordLabel.setForeground(Color.GRAY);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(passwordLabel);

        JTextField password = new JTextField();
        password.setBounds(220, 210, 150, 20);
        panel.add(password);

        JButton createButton =  new JButton("Create");
        createButton.setBackground(Color.BLACK);
        createButton.setForeground(Color.WHITE);
        createButton.setBounds(100, 260, 120, 25);
        panel.add(createButton);

        JButton backButton =  new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(260, 260, 120, 25);
        panel.add(backButton);

        //Side Image
        Image sideImage = new ImageIcon(ClassLoader.getSystemResource("icons/auth_image.jpg")).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JLabel sideImageLabel = new JLabel(new ImageIcon(sideImage));
        sideImageLabel.setBounds(380, 40, 250, 250);
        panel.add(sideImageLabel);



        setVisible(true);
    }

    public static void main(String[] args){
        new Signup();
    }

}
