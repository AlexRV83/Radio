package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetMinStationAfterMaxStation() {
        Radio rad = new Radio();
        int expected = rad.getMinStation();
        rad.setCurrentStation(rad.getMaxStation() + 1);
        rad.nextStation();
        int actual = rad.getMinStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxStationBeForMinStation() {
        Radio rad = new Radio();
        int expected = rad.getMaxStation();
        rad.setCurrentStation(rad.getMinStation() - 1);
        rad.prevStation();
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);

    }


    @Test
    public void shouldNotSetVolumeDownMin() {
        Radio rad = new Radio();
        int expected = rad.getMinVolume();
        rad.setCurrentVolume(rad.getMinVolume() - 1);
        rad.downVolume();
        int actual = rad.getMinVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        int expected = rad.getMaxVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);
        rad.increaseVolume();
        int actual = rad.getMaxVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getCurrentVolume());
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetIncreaseVolumeAsMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());

        int expected = rad.getMaxVolume();

        rad.increaseVolume();
        int actual = rad.getMaxVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetIncreaseVolumeAsMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        int expected = rad.getMinVolume();
        rad.downVolume();
        int actual = rad.getMinVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationAsMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        int expected = rad.getMaxStation();
        rad.nextStation();
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationAsMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());

        int expected = rad.getMinStation();

        rad.prevStation();
        int actual = rad.getMinStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetNextStationWhenCurrentIsMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());
        int expected = rad.getMinStation();
        rad.nextStation();
        int actual = rad.getMinStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetPrevStationWhenCurrentIsMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        int expected = rad.getMaxStation();
        rad.prevStation();
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetMRadioChanel() {
        Radio rad = new Radio();
        int expected = rad.getRadioChanel();
        rad.setCurrentStation(rad.getRadioChanel());
        int actual = rad.getRadioChanel();
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetMinStationAfterMaxStationWithConstructor() {
        Radio rad = new Radio(0,19,19,100,0,25,20);

        assertEquals(0, rad.getMinStation());

    }
    @Test
    public void shouldSetCurrentChanelAndStation() {
        Radio rad = new Radio(0,19,18,100,0,25,19);

        assertEquals(19, rad.getRadioChanel());


    }
    @Test
    public void shouldSetIncreaseVolumeAsMaxWithConstructor() {
        Radio rad = new Radio(0,19,18,100,0,25,19);

        assertEquals(100, rad.getMaxVolume());

    }
    @Test
    public void shouldSetIncreaseVolumeAsMinWithConstructor() {
        Radio rad = new Radio(0,19,18,100,0,25,19);

        assertEquals(0, rad.getMinVolume());

    }
}

