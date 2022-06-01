package ru.netology.domain;

import lombok.Data;

@Data
public class Radio {
    private int radioStation;
    private int radioVolume;
    private int quantityRadioStation = 10;


    public void setRadioStation(int radioStation) {
        if (radioStation > quantityRadioStation) {
            return;
        }
        if (radioStation < -1) {
            return;
        }
        if (radioStation == quantityRadioStation) {
            this.radioStation = 0;
            return;
        }
        if (radioStation == -1) {
            this.radioStation = quantityRadioStation - 1;
            return;
        }
        this.radioStation = radioStation;
    }

    public void stPl1() {
        int newStationP1 = radioStation + 1;
        setRadioStation(newStationP1);
    }

    public void stMin1() {
        int newStationMin1 = radioStation - 1;
        setRadioStation(newStationMin1);
    }

//    public int getRadioStation() {
//        return radioStation;
//    }

    public void setRadioVolume(int radioVolume) {
        if (radioVolume < 0) {
            return;
        }
        if (radioVolume > 100) {
            return;
        }
        if (radioVolume == 100) {
            this.radioVolume = 100;
            return;
        }
        if (radioVolume == 0) {
            this.radioVolume = 0;
            return;
        }
        this.radioVolume = radioVolume;
    }

        public void volPl1 () {
            int newVolPl1 = radioVolume + 1;
            setRadioVolume(newVolPl1);
        }

        public void volMin1 () {
            int newVolMin1 = radioVolume - 1;
            setRadioVolume(newVolMin1);
        }

//    public int getRadioVolume() {
//        return radioVolume;
//    }
}