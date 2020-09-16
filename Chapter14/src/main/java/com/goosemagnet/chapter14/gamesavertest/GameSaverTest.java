package com.goosemagnet.chapter14.gamesavertest;

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {

        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"Bow", "Sword", "Dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"Bare Hands", "Big Axe"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[]{"Spells", "Invisibility"});

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Chapter14/src/main/resources/Game.ser"));
            objectOutputStream.writeObject(one);
            objectOutputStream.writeObject(two);
            objectOutputStream.writeObject(three);
            objectOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Chapter14/src/main/resources/Game.ser"));
            GameCharacter oneRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter twoRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter threeRestore = (GameCharacter) objectInputStream.readObject();

            System.out.println("One's type: " + oneRestore.getType());
            System.out.println("Two's type: " + twoRestore.getType());
            System.out.println("Three's type: " + threeRestore.getType());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
