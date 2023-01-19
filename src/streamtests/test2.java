package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import reduce.ForEach;

public class test2 {

    public static void main(String[] args) {
        
        // Get a map key value key == value
        List<Integer> numbers = List.of(2, 3, 4, 5, 7, 8, 9, 11);

        HashMap<Integer, String> map = new HashMap<>();

        numbers.stream().forEach(e -> {
            map.put(e, e.toString());
        });
        System.out.println(map);       

        Map<Integer, Integer> collect = numbers.stream().collect(Collectors.toMap(e -> e, Function.identity()));

        System.out.println(collect);       

        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("5"));
    }

}
