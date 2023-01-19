package streamprocessing;

public record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public Person(String name){
        this(name, "unknown");
    }

    public Person unnamed(String address) {
        return new Person("Unnamed", address);
    }

    public static Person unknown(String name) {
        return new Person(name, UNKNOWN_ADDRESS);
    }
}
