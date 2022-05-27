package ru.netology.domain;

public class Radio {

    private int radioStation;
    private int radioVolume;

    public void setRadioVolumePlus(int radioVolume) {
        if (radioVolume == 10) {
            this.radioVolume = 10;
            return;
        }
        if (0 <= radioVolume && radioVolume <= 10) {
            this.radioVolume = radioVolume + 1;
        }
    }

    public int getRadioVolumePlus() {
        return radioVolume;
    }

    public void setRadioVolumeMinus(int radioVolume) {
        if (radioVolume == 0) {
            this.radioVolume = 0;
            return;
        }
        if (0 <= radioVolume && radioVolume <= 10) {
            this.radioVolume = radioVolume - 1;
        }
    }

    public int getRadioVolumeMinus() {
        return radioVolume;
    }

    public void setRadioStationPlus(int radioStation) {
        if (radioStation > 10) {
            return;
        }
        if (radioStation < 0) {
            return;
        }
        if (radioStation <= 9) {
            this.radioStation = radioStation + 1;
        }
        if (radioStation == 9) {
            this.radioStation = 0;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStationMinus(int radioStation) {
        if (-1 >= radioStation) {
            return;
        }
        if (radioStation >= 10) {
            return;
        }
        if (radioStation == 0) {
            this.radioStation = 9;
            return;
        } else {
            this.radioStation = radioStation - 1;
        }
    }

    public int getRadioStationMinus() {
        return radioStation;
    }
}


