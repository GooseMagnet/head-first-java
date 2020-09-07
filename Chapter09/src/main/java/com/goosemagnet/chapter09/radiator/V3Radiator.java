package com.goosemagnet.chapter09.radiator;

import java.util.List;

class V3Radiator extends V2Radiator {

    V3Radiator(List lglist) {
        super(lglist);
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}