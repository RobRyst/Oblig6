package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo zooAnimal = new Zoo();

        Gorilla gorilla1 = new Gorilla("Robin", "Gorilla", Animals.DietType.HERBIVORE, 30, 200, 3);
        GrizzlyBear grizzlyBear = new GrizzlyBear("Pablo", "Grizzly Bear", Animals.DietType.OMNIVORE, 7, 200, 3);
        GrizzlyBear grizzlyBear1 = new GrizzlyBear("Robin", "Grizzly Bear", Animals.DietType.OMNIVORE, 30, 200, 6);
        PolarBear polarBear = new PolarBear("Coca", "Polar Bear", Animals.DietType.CARNIVORE, 23, 200, 20);
        PolarBear polarBear1 = new PolarBear("Cola", "Polar Bear", Animals.DietType.CARNIVORE, 14, 200, 20);
        WhaleShark whaleShark = new WhaleShark("BigFish", "Whale Shark", Animals.DietType.OMNIVORE, 9, 200, 4);



        zooAnimal.addAnimalToList(gorilla1);
        zooAnimal.addAnimalToList(grizzlyBear);
        zooAnimal.addAnimalToList(grizzlyBear1);
        zooAnimal.addAnimalToList(polarBear);
        zooAnimal.addAnimalToList(polarBear1);
        zooAnimal.addAnimalToList(whaleShark);



        //Kan også bruke Switch statements
        for (Animals animal : zooAnimal.getAnimals()) {
            if (animal instanceof  Gorilla) {
                Gorilla gorillaInList = (Gorilla) animal;
                System.out.println(gorillaInList);
            }
            if (animal instanceof GrizzlyBear) {
                GrizzlyBear grizzlyBearInList = (GrizzlyBear) animal;
                System.out.println(grizzlyBearInList);
            }
            if (animal instanceof PolarBear) {
                PolarBear polarBearInList = (PolarBear) animal;
                System.out.println(polarBearInList);
            }
            if (animal instanceof WhaleShark) {
                WhaleShark whaleSharkInList = (WhaleShark) animal;
                System.out.println(whaleSharkInList);
            }
        }


        System.out.println("Det er " + zooAnimal.printNumberOfAnimalsInList() + " Antall dyr i denne listen");
        //System.out.println(zooAnimal.printAnimalList());


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
