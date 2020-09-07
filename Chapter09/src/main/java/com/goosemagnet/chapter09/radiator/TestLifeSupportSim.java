package com.goosemagnet.chapter09.radiator;

import java.util.ArrayList;
import java.util.List;

public class TestLifeSupportSim {

    public static void main(String[] args) {
        List aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}