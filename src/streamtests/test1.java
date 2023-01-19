package test;

import java.util.List;

public class test1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 7, 8, 9, 11);

        int sum = numbers.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt((Integer e)->{return e * e;})
        .sum();

        System.out.println(sum);

        int sum2 = numbers.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt(e-> e * e)
        .sum();

        System.out.println(sum2);

        int sum3 = numbers.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt((e) -> e * e)
        .sum();

        System.out.println(sum3);

    }

}
