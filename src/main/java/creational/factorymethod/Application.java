package creational.factorymethod;

import creational.factorymethod.animals.Animal;
import creational.factorymethod.animals.AnimalFactory;

public class Application {

    private static AnimalFactory animalFactory = AnimalFactory.getInstance();

    public static void main(String[] args) {
        chaseThief();
        chaseMice();
    }

    private static void chaseMice() {
        Animal anMeowableAnimal = animalFactory.getAnAnimalThatMakeSoundLike("meow");
        letItSound(anMeowableAnimal);
    }

    private static void chaseThief() {
        Animal anWoofableAnimal = animalFactory.getAnAnimalThatMakeSoundLike("woof");
        letItSound(anWoofableAnimal);
    }

    private static void letItSound(Animal animal) {
        animal.makeSounds();
    }

}
