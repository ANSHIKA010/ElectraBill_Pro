package com.attech.electrabillpro.auth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JLabel userNameLabel, passwordLabel, logInAsLabel;
    private JTextField userNameText, passwordText;
    private Choice logInChoice;
    private JButton logInButton, signUpButton, cancelButton;

    private final int[] paramsForm = {350, 60};
    private final int[] marginBwFields = {120, 40};
    private final int[] labelSize = {80, 20};
    private final int[] fieldSize = {150, 20};
    private final int[] buttonSize = {100, 20};
    private final int[] buttonOffset = {20, 20};

    public Login(){
        super("Login Page");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(720, 360);
        setLocation(400, 150);


        //Username
        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(paramsForm[0], paramsForm[1], labelSize[0], labelSize[1]);
        userNameText = new JTextField();
        userNameText.setBounds(paramsForm[0]+marginBwFields[0], paramsForm[1], fieldSize[0], fieldSize[1]);
        add(userNameLabel);
        add(userNameText);


        //Password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(paramsForm[0], paramsForm[1]+marginBwFields[1], labelSize[0], labelSize[1]);
        passwordText = new JTextField();
        passwordText.setBounds(paramsForm[0]+marginBwFields[0], paramsForm[1]+marginBwFields[1], fieldSize[0], fieldSize[1]);
        add(passwordLabel);
        add(passwordText);


        //LoginAs
        logInAsLabel = new JLabel("Login As");
        logInAsLabel.setBounds(paramsForm[0], paramsForm[1]+2*marginBwFields[1], labelSize[0], labelSize[1]);
        logInChoice = new Choice();
        logInChoice.add("Admin");
        logInChoice.add("Customer");
        logInChoice.setBounds(paramsForm[0]+marginBwFields[0], paramsForm[1]+2*marginBwFields[1], fieldSize[0], fieldSize[1]);
        add(logInAsLabel);
        add(logInChoice);


        //Buttons
        logInButton = new JButton("Log In"
             //   , new ImageIcon(getImgFromRes("login_icon_small.jpg"))
        );
        logInButton.setBounds(paramsForm[0]+buttonOffset[0], paramsForm[1]+3*marginBwFields[1]+buttonOffset[1], buttonSize[0], buttonSize[1]);
        cancelButton = new JButton("Cancel"
             //   , new ImageIcon(getImgFromRes("cancel_icon.png"))
        );
        cancelButton.setBounds(paramsForm[0]+buttonOffset[0]+marginBwFields[0], paramsForm[1]+3*marginBwFields[1]+buttonOffset[1], buttonSize[0], buttonSize[1]);
        signUpButton = new JButton("Sign Up"
             //   , new ImageIcon(getImgFromRes("signup_icon.jpg"))
        );
        signUpButton.setBounds(paramsForm[0]+marginBwFields[0]-2*buttonOffset[0], paramsForm[1]+4*marginBwFields[1]+buttonOffset[1], buttonSize[0], buttonSize[1]);
        add(logInButton);
        add(signUpButton);
        add(cancelButton);

        //OnClickLogic
        logInButton.addActionListener(this);
        signUpButton.addActionListener(this);
        cancelButton.addActionListener(this);


        //Side Image
        Image sideImage = new ImageIcon(ClassLoader.getSystemResource("icons/auth_image.jpg")).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JLabel sideImageLabel = new JLabel(new ImageIcon(sideImage));
        sideImageLabel.setBounds(50, 50, 250, 250);
        add(sideImageLabel);


        setVisible(true);

    }

    private Image getImgFromRes(String resName){
        return new ImageIcon(ClassLoader.getSystemResource("icons/"+resName)).getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT);
    }

    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logInButton){

        }else if(e.getSource() == cancelButton){

        }else if(e.getSource() == signUpButton){

        }
    }
}
