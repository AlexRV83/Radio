package ru.netology.domain;

public class Radio {



    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 5;


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
        this.currentStation = currentStation;
        return;
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

    public void setNextStation() {
        setCurrentStation(currentStation++);
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }


    }


    public void setPrevStation() {
        setCurrentStation(currentStation--);
        if (currentStation < minStation) {
            this.currentStation = maxStation;
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


