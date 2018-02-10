package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {


        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());

        zoo.addAnimal(new Animal("Kot"));
        zoo.addAnimal(new Animal("Tygrys"));
        zoo.addAnimal(new Animal("Krokodyl"));



    }
}
