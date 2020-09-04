package com.goosemagnet.chapter04.poordog;

public class PoorDogTestDrive {

    public static void main(String[] args) {

        PoorDog one = new PoorDog();

        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }

    static int calcArea(int height, int width) {
        return width * height;
    }
}
