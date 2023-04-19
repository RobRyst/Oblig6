package org.example;

public class PolarBear extends Animals{

    private double runDistanceInKm;
    private double runSpeedInKmPerHour;
    public PolarBear(String name, String animalType, DietType dietType, int age, double runDistanceInKm, double runSpeedInKmPerHour) {
        super(name, animalType, dietType, age);
        this.runDistanceInKm = runDistanceInKm;
        this.runSpeedInKmPerHour = runSpeedInKmPerHour;
    }

    @Override
    public double calculateSpeed() {
        return runDistanceInKm / runSpeedInKmPerHour + getAge();
    }


    @Override
    public String toString() {
        return "The name of the " + getAnimalType() + " is " + getName() + " ,and they are considered a " + getDietType() +
                " and the animals " + getName() + " is " + getAge() + " years old" + " The animal runs at a " +
                calculateSpeed() + " km/h"
                ;
    }
}
