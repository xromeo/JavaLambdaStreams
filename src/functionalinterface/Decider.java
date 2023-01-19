package functionalinterface;

// Functional Interface 
// * Contains one abstract method
// * Best practice, use @FunctionalInterface Annotation
// * java.util.function
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

@FunctionalInterface
public interface Decider {
    public abstract boolean decide(String s);
}
