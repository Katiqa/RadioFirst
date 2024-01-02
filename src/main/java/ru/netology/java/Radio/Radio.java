package ru.netology.java.Radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int next = currentStation < 9 ? currentStation + 1 : 0;
        setCurrentStation(next);
    }

    public void prevStation() {
        int prev = currentStation > 0 ? currentStation - 1 : 9;
        setCurrentStation(prev);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
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