package ru.netology.domain;

public class Radio {


    private int minStation = 0;
    private int radioChanel = 10;
    private int maxStation = radioChanel-1;
    private int currentStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 5;


    public Radio() {
    }

    public Radio(int radioChanel) {

        this.radioChanel = radioChanel;
    }
    public int getRadioChanel() {
        return radioChanel;
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
        if (currentStation > minStation) {
            currentStation = currentStation++;

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


}

