package collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Collector Interface
// Collectors Class toList(), toSet(), toMap() ...


public class CollectorsExample2 {
    public static void main(String[] args) {
        
        Stream<String[]> stream = Stream.of(new String [][]{
            {"Zoe Sophia", "You are my daughter"},
            {"Fabricio Alejandro", "You are good boy"},
            {"Gabriel Omar", "You are good-herted boy"},
            {"Marlene Lourdes", "I'm in love with you"}
        });


        Map<String, String> asMap = stream
        .peek(q -> System.out.println(String.format("%s: '%s'", q[0], q[1])))
        .collect(Collectors.toMap(k -> k[0], v -> v[1]));

        System.out.println(asMap.keySet());        
        System.out.println(asMap.values());

        System.out.println(asMap.get("Zoe Sophia"));
    }
}
