package dev.moj;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalstuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "samll", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal animal : animals) {
            doAnimalstuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

    }

    private static void doAnimalstuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }

}
