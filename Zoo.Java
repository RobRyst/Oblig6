package org.example;
import java.util.ArrayList;
import java.util.List;
public class Zoo {

    private List<Animals> animalsInZooList;

    public Zoo() {
        animalsInZooList = new ArrayList<>();
    }

    public void addAnimalToList(Animals newZooAnimal) {
        animalsInZooList.add(newZooAnimal);
    }

    public List<Animals> getAnimals() {
        return animalsInZooList;
    }

    public int printNumberOfAnimalsInList() {
        return animalsInZooList.size();
    }

    //Denne printer ut alle dyrene og toString, men er kanskje unødvendig siden vi allerede skriver ut
    //Verdiene i main, men om den trengs så er den her.
    /*
    public List<Animals> printAnimalList() {
        for (Animals zooAnimals : animalsInZooList) {
            System.out.println(zooAnimals);
        }
        return animalsInZooList;
    }
     */
}
