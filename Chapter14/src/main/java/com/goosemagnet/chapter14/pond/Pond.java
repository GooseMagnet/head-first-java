package com.goosemagnet.chapter14.pond;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Pond {

    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Chapter14/src/main/resources/Pond.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Throws NotSerializableException because Pond is not implementing Serializable
            objectOutputStream.writeObject(myPond);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class Duck {

    }
}

