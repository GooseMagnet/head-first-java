package com.goosemagnet.chapter12.simplegui;

import com.goosemagnet.chapter12.drawpanel.MyDrawPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {

    JFrame jFrame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Change Colors");
        jButton.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        jFrame.getContentPane().add(BorderLayout.SOUTH, jButton);
        jFrame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFrame.repaint();
    }
}
