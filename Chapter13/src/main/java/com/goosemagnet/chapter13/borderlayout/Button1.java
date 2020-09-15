package com.goosemagnet.chapter13.borderlayout;

import javax.swing.*;
import java.awt.*;

public class Button1 {

    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

//    public void go() {
//        JFrame frame = new JFrame();
//        JButton button = new JButton("Click me!");
//        frame.getContentPane().add(BorderLayout.EAST, button);
//        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }

//    public void go() {
//        JFrame frame = new JFrame();
//        JButton button = new JButton("Click like you mean it!");
//        frame.getContentPane().add(BorderLayout.EAST, button);
//        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }

//    public void go() {
//        JFrame frame = new JFrame();
//        JButton button = new JButton("Click This!");
//        Font bigFont = new Font("serif", Font.BOLD, 28);
//        button.setFont(bigFont);
//        frame.getContentPane().add(BorderLayout.NORTH, button);
//        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }

    public void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
