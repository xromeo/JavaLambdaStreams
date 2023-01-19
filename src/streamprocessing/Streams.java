package streamprocessing;

import java.util.List;

// map, filter are intermediate operators
// reduce is a final operator
// Stream provide Pipeline of computational operations
// Intermediate operations can be chained
// Terminal operations termine the pipeline


public class Streams {

    public static void main(String[] args) {
        
        List<String> source = List.of("this",
        "is",
        "a",
        "test",
        "it",
        "is",
        "only",
        "a",
        "test",
        "yeah");
        long count = source.stream()
        .distinct()
        .filter( (word) -> { return word.length() >= 4;} )
        .count();
    
        System.out.println(String.format("Colection has %d distinct words of 4 or more characters.", count));
    
    }

    
}
