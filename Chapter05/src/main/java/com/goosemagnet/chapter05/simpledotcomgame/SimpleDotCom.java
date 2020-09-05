package com.goosemagnet.chapter05.simpledotcomgame;

public class SimpleDotCom {

    int[] locationCells;
    int numberOfHits = 0;

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell: locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }
        if (numberOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
