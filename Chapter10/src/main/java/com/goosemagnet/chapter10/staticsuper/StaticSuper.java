package com.goosemagnet.chapter10.staticsuper;

public class StaticSuper {

    static {
        System.out.println("Super Static Block");
    }

    StaticSuper() {
        System.out.println("Super Constructor");
    }
}
