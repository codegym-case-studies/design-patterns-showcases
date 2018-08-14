package creational.factorymethod.animals;

public class AnimalFactory {
    public Animal getAnAnimalThatMakeSoundLike(String sampleSound) {
        if (sampleSound.toLowerCase().contains("woof")) {
            return new Dog();
        } else if (sampleSound.toLowerCase().contains("meow")) {
            return new Cat();
        }

        return null;
    }
}
