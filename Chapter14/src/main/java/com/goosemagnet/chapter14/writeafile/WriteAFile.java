package com.goosemagnet.chapter14.writeafile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Chapter14/src/main/resources/Foo.txt");
            writer.write("Hello Foo!");
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
