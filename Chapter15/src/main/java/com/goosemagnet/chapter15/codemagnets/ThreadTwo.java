package com.goosemagnet.chapter15.codemagnets;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        Accum a = Accum.getAccum();
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("two " + a.getCount());
    }
}
