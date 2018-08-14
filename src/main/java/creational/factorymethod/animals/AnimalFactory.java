package creational.factorymethod.animals;

public class AnimalFactory {
    public Animal getAnAnimalThatMakeSoundLike(String sampleSound) {
        if (sampleSound.toLowerCase().contains("woof")) {
            return new Dog();
        }

        return null;
    }
}
