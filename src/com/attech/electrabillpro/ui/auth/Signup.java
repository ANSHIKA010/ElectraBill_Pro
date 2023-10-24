package com.attech.electrabillpro.ui.auth;

import com.attech.electrabillpro.database.Conn;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Signup extends JFrame implements ActionListener {


    private JButton createButton, backButton;
    JPanel panel;
    JTextField meter, username, name, password;
    Choice accountType;


    Signup(){
        setBounds(400, 150, 720, 400);
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
        accountType= new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(220, 50, 150, 20);
        panel.add(accountType);

        JLabel meterLabel= new JLabel("Meter Number");
        meterLabel.setBounds(60, 90, 150, 20);
        meterLabel.setForeground(Color.GRAY);
        meterLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(meterLabel);

        meter = new JTextField();
        meter.setBounds(220, 90, 150, 20);
        panel.add(meter);

        JLabel uNameLabel= new JLabel("UserName");
        uNameLabel.setBounds(60, 130, 150, 20);
        uNameLabel.setForeground(Color.GRAY);
        uNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(uNameLabel);

        username = new JTextField();
        username.setBounds(220, 130, 150, 20);
        panel.add(username);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(60, 170, 150, 20);
        nameLabel.setForeground(Color.GRAY);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(nameLabel);

        name = new JTextField();
        name.setBounds(220, 170, 150, 20);
        panel.add(name);

        JLabel passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(60, 210, 150, 20);
        passwordLabel.setForeground(Color.GRAY);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(passwordLabel);

        password = new JTextField();
        password.setBounds(220, 210, 150, 20);
        panel.add(password);

        createButton = new JButton("Create");
        createButton.setBackground(Color.BLACK);
        createButton.setForeground(Color.WHITE);
        createButton.setBounds(100, 260, 120, 25);
        panel.add(createButton);

        backButton =  new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(260, 260, 120, 25);
        panel.add(backButton);

        //Side Image
        Image sideImage = new ImageIcon(ClassLoader.getSystemResource("icons/auth_image.jpg")).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JLabel sideImageLabel = new JLabel(new ImageIcon(sideImage));
        sideImageLabel.setBounds(380, 40, 250, 250);
        panel.add(sideImageLabel);


        //adding listeners to buttons
        createButton.addActionListener(this);
        backButton.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == createButton){
            String aType = accountType.getSelectedItem();
            String meterNo = meter.getText();
            String sUsername = username.getText();
            String sName = name.getText();
            String sPassword = password.getText();

            try {
                Conn c = new Conn();
                String query = "INSERT INTO auth(username, meter_no, name, password, user_type) VALUES('"+sUsername+"','"+meterNo+"','"+sName+"','"+sPassword+"','"+aType+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                setVisible(false);
                new Login();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }


        }else if(e.getSource() == backButton){
            setVisible(false);
            new Login();
        }
    }


    public static void main(String[] args){
        new Signup();
    }


}
