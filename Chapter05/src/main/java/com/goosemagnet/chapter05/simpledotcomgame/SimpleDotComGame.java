package com.goosemagnet.chapter05.simpledotcomgame;

import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int startingLocation = (int) (Math.random() * 5);

        int[] locations = {startingLocation, startingLocation + 1, startingLocation + 2};
        simpleDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = gameHelper.getUserInput("enter a number");
            String result = simpleDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
