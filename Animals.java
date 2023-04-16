package org.example;

public abstract class Animals {

    public enum DietType {
        CARNIVORE, HERBIVORE, OMNIVORE;
    }

    private String name;

    private String animalType;
    private DietType dietType;
    private int age;

    public abstract double calculateSpeed();

    public Animals(String name,String animalType, DietType dietType, int age) {
        this.name = name;
        this.dietType = dietType;
        this.age = age;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }
    public DietType getDietType() {
        return dietType;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "The name of the " + getAnimalType() + " is " + getName() + " ,and they are considered a " + getDietType() +
                " and the animals " + getName() + " is " + getAge() + " years old" + " The animal runs at a " +
                calculateSpeed() + " km/h"
                ;
    }
}

