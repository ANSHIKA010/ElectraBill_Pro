package com.attech.electrabillpro;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    Thread thread2;
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/electrabill_splash.jpeg"));
        Image image = imageIcon.getImage().getScaledInstance(750, 500, Image.SCALE_DEFAULT);
        JLabel jLabel = new JLabel(new ImageIcon(image));
        add(jLabel);
        setVisible(true);


        for(int i=0,j=0; i<=750&&j<=500 ; i+=3, j+=2){
            setSize(i, j);
            setLocation(650-i/3, 400-j/2);
            try {
                Thread.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        thread2 = new Thread(this);
        thread2.start();

    }

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Splash();
    }


}
