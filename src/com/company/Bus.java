package com.company;

public class Bus {

    /**
     * метод описывает движение автобуса
     * @param stationName имя станции
     */
    public void start(String stationName){
        System.out.println("Автобус стартует с остановки " + stationName);
    }

    /**
     * метод описывает движение автобуса
     * @param stationName имя станции
     */

    public void  stop(String stationName){
        System.out.println("Автобус останавливается на остановке " + stationName);
    }
}
