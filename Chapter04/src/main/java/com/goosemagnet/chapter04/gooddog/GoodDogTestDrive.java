package com.goosemagnet.chapter04.gooddog;

import com.goosemagnet.chapter04.dog.Dog;

class GoodDogTestDrive {

    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());

        one.bark();
        two.bark();

        Dog[] pets;
        pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();
    }
}