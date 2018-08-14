package creational.singleton.greeting;

public class Greeting {

    // using a static property so not needed to using `new` multiple times
    private static final Greeting THE_VERY_GREAT_SUPER_ONLY_GREETING = new Greeting();

    private Greeting() {

    }

    public static Greeting getGreeting() {
        return THE_VERY_GREAT_SUPER_ONLY_GREETING;
    }
}
