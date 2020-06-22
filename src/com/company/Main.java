package com.company;


public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(35);
        bus.start("1");
        bus.stop("2");
        Human human = new Human("Alex");
        Dog dog = new Dog("ben");
        human.addDog(dog);
        human.goToBus(bus);
        dog.run();

        bus.start("2");
        bus.stop("4");
        human.goFromBus(bus);
        dog.run();

        Human human1 = new Human("Daria");
        Human human2 = new Human("Alex");
        Human human3 = new Human("Andrey");
        Human human4 = new Human("Den");

        human1.goToBus(bus);
        human2.goToBus(bus);
        human3.goToBus(bus);
        human4.goToBus(bus);

        bus.start("4");
        bus.stop("endStation");

        human1.goFromBus(bus);
        human2.goFromBus(bus);
        human3.goFromBus(bus);
        human4.goFromBus(bus);


    }
}
