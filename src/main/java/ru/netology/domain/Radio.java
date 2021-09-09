package ru.netology.domain;

public class Radio {


    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 5;
    private int radioChanel = currentStation +1;

    public Radio() {
    }

    public Radio(
            int minStation,
            int maxStation,
            int currentStation,
            int maxVolume,
            int minVolume,
            int currentVolume,
            int radioChanel) {

        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.radioChanel = radioChanel;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;


    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation > minStation){
            currentStation = currentStation ++;

        }


    }


    public void prevStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation++;


        }
    }
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getRadioChanel() {
        return radioChanel;
    }
}

