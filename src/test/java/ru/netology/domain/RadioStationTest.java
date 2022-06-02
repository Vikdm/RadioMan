package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioStationTest {

    Radio radioStation = new Radio(10);

    @Test
    void StationPlusTest1() {
        radioStation.setRadioStation(8);

        radioStation.stPl1();

        assertEquals(9, radioStation.getRadioStation());
    }

    @Test
    void StationPlusTest2() {
        radioStation.setRadioStation(9);

        radioStation.stPl1();

        assertEquals(0, radioStation.getRadioStation());
    }

    @Test
    void StationPlusTest3() {
        radioStation.setRadioStation(11);

        assertEquals(0, radioStation.getRadioStation());
    }

    @Test
    void StationPlusTest4() {
        radioStation.setRadioStation(-11);

        assertEquals(0, radioStation.getRadioStation());
    }

    @Test
    void StationMinusTest() {
        radioStation.setRadioStation(0);

        radioStation.stMin1();

        assertEquals(9, radioStation.getRadioStation());
    }

    @Test
    void StationMinusTest2() {
        radioStation.setRadioStation(5);

        radioStation.stMin1();

        assertEquals(4, radioStation.getRadioStation());
    }

    @Test
    void StationMinusTest3() {
        radioStation.setRadioStation(20);

        assertEquals(0, radioStation.getRadioStation());
    }

    @Test
    void StationMinusTest4() {
        radioStation.setRadioStation(-20);

        assertEquals(0, radioStation.getRadioStation());
    }
}



