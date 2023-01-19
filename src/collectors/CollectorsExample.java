package collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


// Collector Interface
// Collectors Class toList(), toSet(), ...


public class CollectorsExample {
    public static void main(String[] args) {

        
        Stream<String> stream = Stream.of("To","be", "or", "not", "to", "be");
        System.out.println();        
        List<String> asList = stream.peek((s)->{System.out.println(s + " ");})
        .collect(java.util.stream.Collectors.toList());

        System.out.println();
        System.out.println(asList);

        Set<String> collect = asList.stream().collect(java.util.stream.Collectors.toSet());
        System.out.println(collect);
    }
}
