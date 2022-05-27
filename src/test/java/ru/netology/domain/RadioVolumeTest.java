package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioVolumeTest {
    Radio radioVolume = new Radio();

    @Test
    void volumePlusTest() {
        radioVolume.setRadioVolumePlus(5);
        int actual = radioVolume.getRadioVolumePlus();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest2() {
        radioVolume.setRadioVolumePlus(0);
        int actual = radioVolume.getRadioVolumePlus();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest3() {
        radioVolume.setRadioVolumePlus(20);
        int actual = radioVolume.getRadioVolumePlus();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest4() {
        radioVolume.setRadioVolumePlus(10);
        int actual = radioVolume.getRadioVolumePlus();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void volumePlusTest5() {
        radioVolume.setRadioVolumePlus(-10);
        int actual = radioVolume.getRadioVolumePlus();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusTest1() {
        radioVolume.setRadioVolumeMinus(0);
        int actual1 = radioVolume.getRadioVolumeMinus();
        int expected = 0;
        assertEquals(expected, actual1);
    }

    @Test
    void volumeMinusTest2() {
        radioVolume.setRadioVolumeMinus(10);
        int actual1 = radioVolume.getRadioVolumeMinus();
        int expected = 9;
        assertEquals(expected, actual1);
    }

    @Test
    void volumeMinusTest3() {
        radioVolume.setRadioVolumeMinus(-10);
        int actual1 = radioVolume.getRadioVolumeMinus();
        int expected = 0;
        assertEquals(expected, actual1);
    }

    @Test
    void volumeMinusTest4() {
        radioVolume.setRadioVolumeMinus(5);
        int actual1 = radioVolume.getRadioVolumeMinus();
        int expected = 4;
        assertEquals(expected, actual1);
    }

    @Test
    void volumeMinusTest5() {
        radioVolume.setRadioVolumeMinus(25);
        int actual1 = radioVolume.getRadioVolumeMinus();
        int expected = 0;
        assertEquals(expected, actual1);
    }
}
