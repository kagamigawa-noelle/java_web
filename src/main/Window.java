package main;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        this.setBounds(100,100,1100,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel jPanel=new JPanel();
        jPanel.setVisible(true);
        jPanel.setBackground(new Color(174, 213, 205));
        jPanel.setLayout(new GridLayout(3,3));
        this.add(jPanel);
    }

    public static void main(String[] args) {
        new Window();
    }
}
