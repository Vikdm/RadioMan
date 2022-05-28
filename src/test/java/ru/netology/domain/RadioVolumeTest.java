package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioVolumeTest {
    Radio radioVolume = new Radio();

    @Test
    void volumePlusTest() {
        radioVolume.setRadioVolume(0);

        radioVolume.volPl1();

        int actual = radioVolume.getRadioVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest2() {
        radioVolume.setRadioVolume(-1);

        int actual = radioVolume.getRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest3() {
        radioVolume.setRadioVolume(10);

        radioVolume.volPl1();

        int actual = radioVolume.getRadioVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest4() {
        radioVolume.setRadioVolume(20);

        int actual = radioVolume.getRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest () {
        radioVolume.setRadioVolume(5);

        radioVolume.volMin1();

        int actual = radioVolume.getRadioVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest2 () {
        radioVolume.setRadioVolume(0);

        radioVolume.volMin1();

        int actual = radioVolume.getRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest3 () {
        radioVolume.setRadioVolume(-5);

        int actual = radioVolume.getRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest4 () {
        radioVolume.setRadioVolume(20);

        int actual = radioVolume.getRadioVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest5 () {
        radioVolume.setRadioVolume(10);

        radioVolume.volMin1();

        int actual = radioVolume.getRadioVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

}


