package ru.netology.domain;

public class Radio {
    private int numberStations = 10;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }

    public Radio() {
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void prevRadioStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberStations - 1;
        }
    }

    public void nextRadioStation() {
        if (currentStation < (numberStations - 1)) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;
        }
        if (currentStation > (numberStations - 1)){
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}