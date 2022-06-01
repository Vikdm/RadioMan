package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioVolumeTest {
    Radio radioVolume = new Radio();

    @Test
    void volumePlusTest() {
        radioVolume.setRadioVolume(0);

        radioVolume.volPl1();

        assertEquals(1, radioVolume.getRadioVolume());
    }

    @Test
    void volumePlusTest2() {
        radioVolume.setRadioVolume(-1);

        assertEquals(0, radioVolume.getRadioVolume());
    }

    @Test
    void volumePlusTest3() {
        radioVolume.setRadioVolume(100);

        radioVolume.volPl1();

        assertEquals(100, radioVolume.getRadioVolume());
    }

    @Test
    void volumePlusTest4() {
        radioVolume.setRadioVolume(120);

        assertEquals(0, radioVolume.getRadioVolume());
    }

    @Test
    void volumeMinusTest () {
        radioVolume.setRadioVolume(5);

        radioVolume.volMin1();

        assertEquals(4, radioVolume.getRadioVolume());
    }

    @Test
    void volumeMinusTest2 () {
        radioVolume.setRadioVolume(0);

        radioVolume.volMin1();

        assertEquals(0, radioVolume.getRadioVolume());
    }

    @Test
    void volumeMinusTest3 () {
        radioVolume.setRadioVolume(-5);

        assertEquals(0, radioVolume.getRadioVolume());
    }

    @Test
    void volumeMinusTest4 () {
        radioVolume.setRadioVolume(120);

        assertEquals(0, radioVolume.getRadioVolume());
    }

    @Test
    void volumeMinusTest5 () {
        radioVolume.setRadioVolume(10);

        radioVolume.volMin1();

        assertEquals(9, radioVolume.getRadioVolume());
    }

}


