package com.company;

public class Dog {
    public String dogName;

    /**
     *
     * @param name имя собаки
     *        конструктор собаки
     */
    public Dog(String name) {
        this.dogName = name;
    }

    /**
     * метод движения собаки
     */
    public void run(){
        System.out.println("dog "+ dogName +" run");
    }
}
