package com.goosemagnet.chapter09.radiator;

class SimUnit {

    String botType;

    SimUnit(String type) {
        botType = type;
        System.out.println(type);
    }

    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}