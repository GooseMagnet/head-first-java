package com.goosemagnet.chapter14.box;

import java.io.*;

public class Box implements Serializable {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("foo.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myBox);
            objectOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
