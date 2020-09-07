package com.goosemagnet.chapter09.garbagecollector;

public class GC {

    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();


        /* Lines that would cause exactly one additional object to be eligible for garbage collection
         *  gc2 = null
         *  gc1 = null
         *  gc1 = gc4
         */
    }

    public static void doStuff2(GC copyGC) {
        GC localGC;
    }
}
