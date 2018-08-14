package creational.singleton;

import creational.singleton.greeting.Greeting;

public class Application {

    // using a static property so not needed to using `new` multiple times
    private static Greeting theVeryGreatSuperOnlyGreeting = new Greeting();

    public static void main(String[] args) {
        Greeting firstGreeting = getGreeting();
        Greeting secondGreeting = getGreeting();

        // two different object
        System.out.println(firstGreeting);
        System.out.println(secondGreeting);
    }

    private static Greeting getGreeting() {
        return theVeryGreatSuperOnlyGreeting;
    }
}
