package methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamprocessing.Person;

// map, filter are intermediate operators
// reduce is a final operator
// Stream provide Pipeline of computational operations
// Intermediate operations can be chained
// Terminal operations termine the pipeline

// Collection stream() method
// Creating from an array
// Sream class helper methods

public class MethodReference {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Zoe", "Villa Salome"));
        persons.add(new Person("Fabricio", "Villa Salome"));
        persons.add(new Person("Gabriel", "San Isidro"));
        persons.add(new Person("Marlene", "Pampalandia"));

        persons.stream()
        .map(p -> p.name())
        .filter(p -> Objects.nonNull(p)) //Static method
        .peek(p-> System.out.println(p)) //Instance mthod of a particular object
        .map(p-> p.toUpperCase()) // Instance method of an arbitrary object
        .map(p -> new Person(p, "unknown")) // Constructor
        .forEach(p-> System.out.println(p.name()));


        persons.stream()
        .map(p -> p.name())
        .filter(Objects::nonNull) //Static method
        .peek(System.out::println) //Instance mthod of a particular object
        .map(String::toUpperCase) // Instance method of an arbitrary object
        .map(Person::new) // Constructor
        .forEach(p-> System.out.println(p.name()));


    }

}
