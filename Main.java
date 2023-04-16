package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo listOfZooAnimals = new Zoo();
        listOfZooAnimals.addAnimalToList("Kenneth", "Gorilla", Animals.DietType.HERBIVORE, 42, 200, 42);
        listOfZooAnimals.addAnimalToList("Robin", "Grizzly Bear", Animals.DietType.OMNIVORE, 30, 200, 10);
        listOfZooAnimals.addAnimalToList("Coca", "Polar Bear", Animals.DietType.CARNIVORE, 20, 200, 42);
        listOfZooAnimals.addAnimalToList("Cola","Polar Bear", Animals.DietType.CARNIVORE, 10, 200, 20);

        System.out.println(listOfZooAnimals.printNumberOfAnimalsInList());
        listOfZooAnimals.printAnimalList();


    /*System.out.println(listOfAnimals.gorilla);
        System.out.println(listOfAnimals.gorilla1);
        System.out.println(listOfAnimals.whaleShark);
        System.out.println(listOfAnimals.grizzlyBear);
        System.out.println(listOfAnimals.grizzlyBear1);
        System.out.println(listOfAnimals.grizzlyBear2);
        System.out.println(listOfAnimals.polarBear);
        System.out.println(listOfAnimals.polarBear1);
     */
    }
}
