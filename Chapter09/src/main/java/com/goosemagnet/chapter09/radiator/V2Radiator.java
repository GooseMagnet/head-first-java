package com.goosemagnet.chapter09.radiator;

import java.util.List;

public class V2Radiator {

    V2Radiator(List list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
