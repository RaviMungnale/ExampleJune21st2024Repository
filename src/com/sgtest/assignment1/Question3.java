package com.sgtest.assignment1;
class Animals {
    String animalName;
    String animalType;
    String breed;

    Animals() {
        animalName = "Lion:";
        animalType = "Carnivorous";
        breed = "Panthera leo";
        System.out.println("AnimalName:" + animalName);
        System.out.println("Animal Type:" + animalType);
        System.out.println("Breed:" + breed);
        System.out.println();
    }
}
class AquaticAnimals{
    String name;
    String type;
    String breed;
    AquaticAnimals()
    {
        name="Star Fish:";
        type="Aquatic";
        breed="Asteroidea";
        System.out.println("Name:"+name);
        System.out.println("Type:"+type);
        System.out.println("breed:"+breed);
        System.out.println();
    }
}
public class Question3 {
    public static void main(String[] args) {
        Animals obj9= new Animals();
        AquaticAnimals obj7=new AquaticAnimals();

    }
}
