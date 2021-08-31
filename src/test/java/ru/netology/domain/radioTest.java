package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {


    @Test
    public void shouldSetMinStationAfterMaxStation() {
        radio rad = new radio();
        int expected = rad.getMinStation();
        rad.setCurrentStation(rad.getMaxStation() + 1);
        rad.setNextStation();
        int actual = rad.getMinStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxStationBeForMinStation() {
        radio rad = new radio();
        int expected = rad.getMaxStation();
        rad.setCurrentStation(rad.getMinStation() - 1);
        rad.setPrevStation();
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);

    }


    @Test
    public void shouldNotSetVolumeDownMin() {
        radio rad = new radio();
        int expected = rad.getMinVolume();
        rad.setCurrentVolume(rad.getMinVolume() - 1);
        rad.downVolume();
        int actual = rad.getMinVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio rad = new radio();
        int expected = rad.getMaxVolume();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);
        rad.increaseVolume();
        int actual = rad.getMaxVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolume() {
        radio rad = new radio();
        int expected = rad.getCurrentVolume();
        rad.setCurrentVolume(rad.getCurrentVolume());
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

  // @Test
  //  public void shouldSetCurrentStation() {
   //     radio rad = new radio();
   //   int expected = rad.getMinStation();
   //     rad.setCurrentStation(rad.getMaxStation()+15);
    //   rad.setNextStation();
    //   int actual = rad.getMinStation();
    //    assertEquals(expected, actual);

    }


