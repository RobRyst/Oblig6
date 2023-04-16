package org.example;

import java.util.ArrayList;
import java.util.List;
public class Zoo {

    private List<Zoo> animalsInZooList;

    public Zoo() {
        animalsInZooList = new ArrayList<>();
    }

    public void addAnimalToList(String name, String animalType, Animals.DietType dietType, int age,
                                double runDistanceInKm, double runSpeedInKmPerHour) {

        Zoo zooAnimals = new Zoo();
        animalsInZooList.add(zooAnimals);
    }

    /*
    Gorilla gorilla = new Gorilla("Kenneth", "Gorilla", Animals.DietType.HERBIVORE, 40, 200, 5);
    Gorilla gorilla1 = new Gorilla("Robin", "Gorilla", Animals.DietType.HERBIVORE, 30, 200, 3);

    GrizzlyBear grizzlyBear = new GrizzlyBear("Pablo", "Grizzly Bear", Animals.DietType.OMNIVORE, 15, 200, 48);
    GrizzlyBear grizzlyBear1 = new GrizzlyBear("Escobear", "Grizzly Bear", Animals.DietType.OMNIVORE, 8, 200, 45);
    GrizzlyBear grizzlyBear2 = new GrizzlyBear("Pluto", "Grizzly Bear", Animals.DietType.OMNIVORE, 4, 200, 60);

    PolarBear polarBear = new PolarBear("Coca", "Polar Bear", Animals.DietType.CARNIVORE, 8, 200, 45);
    PolarBear polarBear1 = new PolarBear("Cola", "Polar Bear", Animals.DietType.CARNIVORE, 22, 200, 28);

    WhaleShark whaleShark = new WhaleShark("BigFish", "Whale Shark", Animals.DietType.OMNIVORE, 40, 200, 6.44);

    */
    public int printNumberOfAnimalsInList() {
        return animalsInZooList.size();
    }

    public void printAnimalList() {
        for (Zoo zooAnimals : animalsInZooList) {
            System.out.println(zooAnimals);
        }
    }
}


