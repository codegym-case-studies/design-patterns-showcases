package creational.singleton.greeting;

public class Greeting {

    private static volatile Greeting theVeryGreatSuperOnlyGreeting;

    private Greeting() {

    }

    public static Greeting getGreeting() {
        if (theVeryGreatSuperOnlyGreeting == null) {
            synchronized (Greeting.class) {
                if (theVeryGreatSuperOnlyGreeting == null) {
                    theVeryGreatSuperOnlyGreeting = new Greeting();
                }
            }
        }
        return theVeryGreatSuperOnlyGreeting;
    }
}
