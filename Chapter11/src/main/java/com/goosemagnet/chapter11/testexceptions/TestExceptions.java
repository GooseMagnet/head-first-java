package com.goosemagnet.chapter11.testexceptions;

public class TestExceptions {

    public static void main(String[] args) {
        String test = "no";

        try{
            System.out.println("Start try");
            doRisky(test);
            System.out.println("End try");
        } catch (ScaryException se) {
            System.out.println("Scary Exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End of main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("Start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("End risky");
    }
}
