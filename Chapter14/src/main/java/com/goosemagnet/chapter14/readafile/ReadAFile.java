package com.goosemagnet.chapter14.readafile;

import java.io.*;

public class ReadAFile {

    public static void main(String[] args) {
        try {
            File myFile = new File("Chapter14/src/main/resources/MyText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
