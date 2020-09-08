package com.goosemagnet.chapter10.player;

public class Player {

    static int playerCount = 0;
    private String name;

    public Player(String n) {
        name = n;
        playerCount++;
    }
}
