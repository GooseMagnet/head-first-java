package com.goosemagnet.chapter16.sortmountains;

public class Mountain {

    String name;
    Integer height;

    public Mountain(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name + " " + height;
    }
}
