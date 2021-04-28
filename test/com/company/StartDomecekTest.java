package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartDomecekTest {

    @Test
    void nasaditFig() {
        BarFig barva = new BarFig(1,2,3);
        StartDomecek start = new StartDomecek(barva, 4);
        Figs figurka = start.nasaditFig();
        assertEquals(4,start.figurkyDom.size());
    }

    @Test
    void vratitFig() {
    }
}