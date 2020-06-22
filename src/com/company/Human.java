package com.company;

public class Human {
    public String name;
    public Dog dog;

    /**
     *
     * @param name имя человека
     */
    public Human(String name) {
        this.name = name;
    }

    /**
     *
     * @param bus автобос
     *            метод описывает посадку в автобус
     */
    public void goToBus(Bus bus) {
        if (dog == null) {
            System.out.println(name + " moved to bus " + bus.number);
        } else {
            System.out.println(name + " moved to bus " + bus.number + " with dog " + dog.dogName);
        }
    }

    /**
     * метод описывает высадку из автобуса
     * @param bus автобус
     */

    public void goFromBus(Bus bus) {
        if (dog == null) {
            System.out.println(name + " moved from bus " + bus.number);
        } else {
            System.out.println(name + " moved from bus " + bus.number + " with dog " + dog.dogName);
        }
    }

    /**
     *  Метод добавления собаки
     * @param dog собака
     */
    public void addDog(Dog dog) {
        this.dog = dog;
    }

}
