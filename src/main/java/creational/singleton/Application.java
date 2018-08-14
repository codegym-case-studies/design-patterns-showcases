package creational.singleton;

import creational.singleton.greeting.Greeting;

public class Application {
    public static void main(String[] args) {
        Greeting firstGreeting = new Greeting();
        Greeting secondGreeting = new Greeting();

        // two different object
        System.out.println(firstGreeting);
        System.out.println(secondGreeting);
    }
}
