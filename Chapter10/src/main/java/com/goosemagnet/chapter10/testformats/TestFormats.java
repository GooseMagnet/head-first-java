package com.goosemagnet.chapter10.testformats;

public class TestFormats {

    public static void main(String[] args) {
        String s = String.format("%,d", 1000000000);
        System.out.println(s); // 1,000,000,000

        String f = String.format("I have %.2f bugs to fix.", 476578.09876);
        System.out.println(f); // I have 476578.10 bugs to fix.

        String f2 = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(f2); // I have 476,578.10 bugs to fix.

        int one = 20456654;
        double two = 100567890.248907;
        String f3 = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(f3);
    }
}
