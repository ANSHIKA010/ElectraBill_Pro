package com.attech.electrabillpro;

import com.attech.electrabillpro.auth.Login;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    Thread thread2;
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/electrabill_splash.jpeg"));
        Image image = imageIcon.getImage().getScaledInstance(750, 500, Image.SCALE_DEFAULT);
        JLabel jLabel = new JLabel(new ImageIcon(image));
        add(jLabel);


        thread2 = new Thread(this);
        thread2.start();

        setSize(750, 500);
        setLocation(400, 150);
        setVisible(true);

    }

    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Splash();
    }


}
