package reduce;

import java.util.Arrays;
import java.util.List;

// Reduction stream operations allow us to produce one single result from a sequence of elements, by repeatedly applying a combining operation to the elements in the sequence.
/*
 * Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
 * Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
 * Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
 */
public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0,
                        (subtotal, element) -> subtotal + element);
        System.out.println("Result:" + result);

        int result2 = numbers
                .stream()
                .reduce(0,
                        Integer::sum);
        System.out.println("Result:" + result2);
    }
}
