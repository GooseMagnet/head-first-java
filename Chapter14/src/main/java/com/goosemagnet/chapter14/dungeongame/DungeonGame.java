package com.goosemagnet.chapter14.dungeongame;

import java.io.*;

public class DungeonGame implements Serializable {

    public int x = 3;
    transient long y = 4;
    private short z = 5;

    short getZ() {
        return z;
    }

    int getX() {
        return x;
    }

    long getY() {
        return y;
    }
}
