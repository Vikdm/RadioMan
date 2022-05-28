package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioStationTest {

    Radio radioStation = new Radio();

    @Test
    void StationPlusTest1() {
        radioStation.setRadioStation(8);

        radioStation.stPl1();

        int actual = radioStation.getRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest2() {
        radioStation.setRadioStation(9);

        radioStation.stPl1();

        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest3() {
        radioStation.setRadioStation(11);

        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationPlusTest4() {
        radioStation.setRadioStation(-11);

        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest() {
        radioStation.setRadioStation(0);

        radioStation.stMin1();

        int actual = radioStation.getRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest2() {
        radioStation.setRadioStation(5);

        radioStation.stMin1();

        int actual = radioStation.getRadioStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest3() {
        radioStation.setRadioStation(20);

        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void StationMinusTest4() {
        radioStation.setRadioStation(-20);

        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
}



