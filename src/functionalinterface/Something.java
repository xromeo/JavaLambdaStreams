package functionalinterface;

@FunctionalInterface
public interface Something<T,R> {
    R apply(T param);
    
}
