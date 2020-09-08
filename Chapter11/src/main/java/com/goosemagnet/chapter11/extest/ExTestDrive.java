package com.goosemagnet.chapter11.extest;

import java.util.Scanner;

public class ExTestDrive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Throw exception? [yes/no]: ");
        String test = scanner.next();

        System.out.print("t");

        try {
            doRisky(test);
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
        System.out.print("o");
    }
}
