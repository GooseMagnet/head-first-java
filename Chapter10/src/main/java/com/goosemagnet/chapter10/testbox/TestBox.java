package com.goosemagnet.chapter10.testbox;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i; // i is Null, this will crash at runtime since an int can't be null
        System.out.println(j);
        System.out.println(i);
    }
}