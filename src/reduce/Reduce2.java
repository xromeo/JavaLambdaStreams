package reduce;

import java.util.Arrays;
import java.util.List;

// Reduction stream operations allow us to produce one single result from a sequence of elements, by repeatedly applying a combining operation to the elements in the sequence.
/*
 * Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
 * Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
 * Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
 */
public class Reduce2 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);

        System.out.println("Result:" + result);

        String result2 = letters
                .stream()
                .reduce("", String::concat);

        System.out.println("Result:" + result2);

        String result3 = letters
                .stream()
                .reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());

        System.out.println("Result:" + result3);

        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);

        System.out.println("Computed Ages: " + computedAges);
        /*
         * When a stream executes in parallel, the Java runtime splits the stream into multiple substreams. In such cases, we need to use a function to combine the results of the substreams into a single one. This is the role of the combiner — in the above snippet, it's the Integer::sum method reference.
         */

    }
}
