package com.company;

public class Bus {
    public int number;

    public Bus(int number) {
        this.number = number;
    }

    /**
     * метод описывает движение автобуса
     *
     * @param stationName имя станции
     */
    public void start(String stationName) {
        System.out.println("Bus start from station " + stationName);
    }

    /**
     * метод описывает движение автобуса
     *
     * @param stationName имя станции
     */

    public void stop(String stationName) {
        System.out.println("Bus stop on station  " + stationName);
    }
}
