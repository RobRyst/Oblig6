package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo listOfZooAnimals = new Zoo();
        
        /*Gorilla gorilla = new Gorilla("Kenneth", "Gorilla", Animals.DietType.HERBIVORE, 40, 200, 5);
        Gorilla gorilla1 = new Gorilla("Robin", "Gorilla", Animals.DietType.HERBIVORE, 30, 200, 3);

        GrizzlyBear grizzlyBear = new GrizzlyBear("Pablo", "Grizzly Bear", Animals.DietType.OMNIVORE, 15, 200, 48);
        GrizzlyBear grizzlyBear1 = new GrizzlyBear("Escobear", "Grizzly Bear", Animals.DietType.OMNIVORE, 8, 200, 45);
        GrizzlyBear grizzlyBear2 = new GrizzlyBear("Pluto", "Grizzly Bear", Animals.DietType.OMNIVORE, 4, 200, 60);

        PolarBear polarBear = new PolarBear("Coca", "Polar Bear", Animals.DietType.CARNIVORE, 8, 200, 45);
        PolarBear polarBear1 = new PolarBear("Cola", "Polar Bear", Animals.DietType.CARNIVORE, 22, 200, 28);

        WhaleShark whaleShark = new WhaleShark("BigFish", "Whale Shark", Animals.DietType.OMNIVORE, 40, 200, 6.44);
         */


        listOfZooAnimals.addAnimalToList("Kenneth", "Gorilla", Animals.DietType.HERBIVORE, 42, 200, 42);
        listOfZooAnimals.addAnimalToList("Robin", "Grizzly Bear", Animals.DietType.OMNIVORE, 30, 200, 10);
        listOfZooAnimals.addAnimalToList("Coca", "Polar Bear", Animals.DietType.CARNIVORE, 20, 200, 42);
        listOfZooAnimals.addAnimalToList("Cola","Polar Bear", Animals.DietType.CARNIVORE, 10, 200, 20);
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
