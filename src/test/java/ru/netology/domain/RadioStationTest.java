package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioStationTest {

    Radio radioStation = new Radio();

    @Test
    void StationPlusTest1() {
        radioStation.setRadioStationPlus(8);
        int actual = radioStation.getRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest2() {
        radioStation.setRadioStationPlus(9);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest3() {
        radioStation.setRadioStationPlus(0);
        int actual = radioStation.getRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest4() {
        radioStation.setRadioStationPlus(10);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest5() {
        radioStation.setRadioStationPlus(-1);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest6() {
        radioStation.setRadioStationPlus(1);
        int actual = radioStation.getRadioStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest7() {
        radioStation.setRadioStationPlus(11);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest1() {
        radioStation.setRadioStationMinus(0);
        int actual = radioStation.getRadioStationMinus();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest2() {
        radioStation.setRadioStationMinus(1);
        int actual = radioStation.getRadioStationMinus();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest3() {
        radioStation.setRadioStationMinus(2);
        int actual = radioStation.getRadioStationMinus();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest4() {
        radioStation.setRadioStationMinus(3);
        int actual = radioStation.getRadioStationMinus();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest5() {
        radioStation.setRadioStationMinus(4);
        int actual = radioStation.getRadioStationMinus();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest6() {
        radioStation.setRadioStationMinus(5);
        int actual = radioStation.getRadioStationMinus();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest7() {
        radioStation.setRadioStationMinus(6);
        int actual = radioStation.getRadioStationMinus();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest8() {
        radioStation.setRadioStationMinus(7);
        int actual = radioStation.getRadioStationMinus();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest9() {
        radioStation.setRadioStationMinus(8);
        int actual = radioStation.getRadioStationMinus();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest10() {
        radioStation.setRadioStationMinus(9);
        int actual = radioStation.getRadioStationMinus();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest11() {
        radioStation.setRadioStationMinus(10);
        int actual = radioStation.getRadioStationMinus();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest12() {
        radioStation.setRadioStationMinus(-1);
        int actual = radioStation.getRadioStationMinus();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
