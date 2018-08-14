package creational.factorymethod.animals;

public class AnimalFactory {

    private static AnimalFactory singletonObject ;

    private AnimalFactory() {
    }

    public static AnimalFactory getInstance() {
        if (singletonObject == null) {
            synchronized (AnimalFactory.class) {
                if (singletonObject == null) {
                    singletonObject = new AnimalFactory();
                }
            }
        }
        return singletonObject;
    }

    public Animal getAnAnimalThatMakeSoundLike(String sampleSound) {
        if (sampleSound.toLowerCase().contains("woof")) {
            return new Dog();
        } else if (sampleSound.toLowerCase().contains("meow")) {
            return new Cat();
        }

        return null;
    }
}
