package com.goosemagnet.chapter13.flowlayout;

import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock Me");
        JButton buttonTwo = new JButton("Bliss");

        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
