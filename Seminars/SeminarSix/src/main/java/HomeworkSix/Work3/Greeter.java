package HomeworkSix.Work3;

public class Greeter {
    private final Greeting greeting;

    public Greeter() {
        this.greeting = new GreetingDefault();
    }

    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return greeting.greet();
    }
}
