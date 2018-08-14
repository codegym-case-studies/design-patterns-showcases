package creational.factorymethod;

import creational.factorymethod.animals.Animal;
import creational.factorymethod.animals.AnimalFactory;

public class Application {

    private static AnimalFactory animalFactory = new AnimalFactory();

    public static void main(String[] args) {
        chaseThief();
    }

    private static void chaseThief() {
        Animal anWoofableAnimal = animalFactory.getAnAnimalThatMakeSoundLike("woof");
        letItSound(anWoofableAnimal);
    }

    private static void letItSound(Animal animal) {
        animal.makeSounds();
    }

}
