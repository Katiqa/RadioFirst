package ru.netology.java.Radio;

public class Radio {
    private int maxStation = 10 - 1;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int quantityStation) {
        this.maxStation = quantityStation - 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int next = currentStation < maxStation ? currentStation + 1 : minStation;
        setCurrentStation(next);
    }

    public void prevStation() {
        int prev = currentStation > minStation ? currentStation - 1 : maxStation;
        setCurrentStation(prev);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int increase = currentVolume + 1;
        setCurrentVolume(increase);
    }

    public void decreaseVolume() {
        int decrease = currentVolume - 1;
        setCurrentVolume(decrease);
    }
}