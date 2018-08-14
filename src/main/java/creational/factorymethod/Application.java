package creational.factorymethod;

import creational.factorymethod.animals.Animal;
import creational.factorymethod.animals.Dog;

public class Application {
    public static void main(String[] args) {
        chaseThief();
    }

    private static void chaseThief() {
        Animal anWoofableAnimal = new Dog();
        letItSound(anWoofableAnimal);
    }

    private static void letItSound(Animal animal) {
        animal.makeSounds();
    }

}
