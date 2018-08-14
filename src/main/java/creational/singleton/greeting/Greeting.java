package creational.singleton.greeting;

public class Greeting {

    private static Greeting theVeryGreatSuperOnlyGreeting;

    private Greeting() {

    }

    public static Greeting getGreeting() {
        if (theVeryGreatSuperOnlyGreeting == null) {
            theVeryGreatSuperOnlyGreeting = new Greeting();
        }
        return theVeryGreatSuperOnlyGreeting;
    }
}
