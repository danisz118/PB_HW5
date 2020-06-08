package com.company.Station;

public class ForthStation {
    /**
     * Метод описывет высадку пассажиров
     * @param people количество людей которые вышли с автобуса
     * @param pet количество животных
     */
    public void backFromBus(int people,int pet){
        System.out.println("Из автобуса вышли " + people + " человек  и  " +people + " животное ");

    }

    /**
     * Метод описывает посадку пассажиров
     * @param countPeople количество людей которые сели в автобус
     */
    public void sitAtBus(int countPeople) {
        System.out.println("В автобус сели людей: " + countPeople );
    }
}
