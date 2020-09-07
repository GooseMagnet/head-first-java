package com.goosemagnet.chapter06.dotcomgame;

import java.util.List;

public class DotCom {

    private List<String> locationCells;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    void setLocationCells(List<String> loc) {
        locationCells = loc;
    }

    String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
