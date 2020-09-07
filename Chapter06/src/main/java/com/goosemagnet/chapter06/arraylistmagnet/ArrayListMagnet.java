package com.goosemagnet.chapter06.arraylistmagnet;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMagnet {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);

        a.remove(2);

        if (a.contains("three")) {
            a.add("four");
        }
        printAL(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);

        if (a.contains("two")) {
            a.add("2.2");
        }
        printAL(a);
    }

    public static void printAL(List<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
