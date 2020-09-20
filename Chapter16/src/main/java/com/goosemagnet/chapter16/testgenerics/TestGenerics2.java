package com.goosemagnet.chapter16.testgenerics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics2 {

    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    public void go() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
    }

    public <T extends Animal> void takeAnimals(List<T> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public void takeAnimals2(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
