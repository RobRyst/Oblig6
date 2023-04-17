package org.example;
import java.util.ArrayList;
import java.util.List;
public class Zoo {

    private List<Animals> animalsInZooList;

    public Zoo() {
        animalsInZooList = new ArrayList<>();
    }

    public void addAnimalToList(String name, String animalType, Animals.DietType dietType, int age,
                                double runDistanceInKm, double runSpeedInKmPerHour) {
        Animals zooAnimals = new Animals();
        animalsInZooList.add(zooAnimals);
    }

    public int printNumberOfAnimalsInList() {
        return animalsInZooList.size();
    }

    public void printAnimalList() {
        for (Animals zooAnimals : animalsInZooList) {
            System.out.println(zooAnimals);
        }
    }
}


