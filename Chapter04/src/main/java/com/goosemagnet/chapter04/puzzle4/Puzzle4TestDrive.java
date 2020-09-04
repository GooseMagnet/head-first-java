package com.goosemagnet.chapter04.puzzle4;

class Puzzle4TestDrive {
    public static void main(String[] args) {
        Puzzle4[] obs = new Puzzle4[6];
        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6) {
            obs[x] = new Puzzle4();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }

        x = 6;

        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }

        System.out.println("result " + result);
    }
}
