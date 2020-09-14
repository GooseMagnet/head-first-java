package com.goosemagnet.chapter12.ballanimation;

import javax.swing.*;
import java.awt.*;

public class BallAnimation {

    JFrame jFrame;
    int posX;
    int posY;

    public static void main(String[] args) {
        BallAnimation ballAnimation = new BallAnimation();
        ballAnimation.go();
    }

    public void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);

        Ball ball = new Ball();
        jFrame.getContentPane().add(ball);
        jFrame.setVisible(true);

        for (int i = 0; i < jFrame.getSize().getHeight(); i += 5) {
            posX = i;
            posY = i;
            ball.repaint();
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Ball extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.ORANGE);
            g.fillOval(posX, posY, 100, 100);
        }
    }
}
