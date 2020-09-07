package com.goosemagnet.chapter07.mixedmessages;

public class Mixed2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1(); // B's m1
        c.m2(); // A's m2
        a.m3(); // A's m3
        System.out.println();

        c.m1(); // B's m1
        c.m2(); // A's m2
        c.m3(); // C's m3, 13
        System.out.println();

        a.m1(); // A's m1
        b.m2(); // A's m2
        c.m3(); // C's m3, 13
        System.out.println();

        a2.m1(); // B's m1
        a2.m2(); // A's m2
        a2.m3(); // C's m3, 13
        System.out.println();
    }
}
