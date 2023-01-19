package streamprocessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// map, filter are intermediate operators
// reduce is a final operator
// Stream provide Pipeline of computational operations
// Intermediate operations can be chained
// Terminal operations termine the pipeline

// Collection stream() method
// Creating from an array
// Sream class helper methods

public class StreamsCreation {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Zoe", "Villa Salome"));
        persons.add(new Person("Fabricio", "Villa Salome"));
        persons.add(new Person("Gabriel", "San Isidro"));
        persons.add(new Person("Marlene", "Pampalandia"));

        persons.stream()
                .filter(p -> p.name().equals("Zoe"))
                .forEach(w -> w.address());

        String[] words = new String[] { "the", "quick", "brown", "box" };

        List<String> upper = Arrays.stream(words)
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());

        Stream<Integer> intStream = Stream.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        intStream
        .limit(5)
        .forEach(System.out::println);

        //Builder
        Stream.Builder<Double> theBuilder = Stream.<Double>builder();
        Stream<Double> decimals = theBuilder.add(2.1).add(4.9).add(8.5).build();

        int sum = decimals
        .mapToInt(d-> (int) Math.round(d))
        .sum();

        System.out.println("Suma:" + sum);

        // Iterate 
        Stream<Integer> ininiteStream = Stream.iterate(10, n -> n+1);
        //  add up the numebers from 10 to 19
        int sumInt = ininiteStream.limit(10).mapToInt(i->i).sum();

        System.out.println("Sum int: " + sumInt);

        // Empty
        Stream.empty();




    }

}
