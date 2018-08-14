package creational.singleton.greeting;

public class Greeting {

    // using a static property so not needed to using `new` multiple times
    private static Greeting theVeryGreatSuperOnlyGreeting = new Greeting();

    private Greeting() {

    }

    public static Greeting getGreeting() {
        return theVeryGreatSuperOnlyGreeting;
    }
}
