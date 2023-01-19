package reduce;

import java.util.Arrays;
import java.util.List;

/**
 * When we use parallelized streams, we should make sure that reduce() or any
 * other aggregate operations executed on the streams are:
 * 
 * associative: the result is not affected by the order of the operands
 * non-interfering: the operation doesn't affect the data source
 * stateless and deterministic: the operation doesn't have state and produces
 * the same output for a given input
 * We should fulfill all these conditions to prevent unpredictable results.
 * 
 * As expected, operations performed on parallelized streams, including
 * reduce(), are executed in parallel, hence taking advantage of multi-core
 * hardware architectures.
 */
public class ReducingInParallel {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));

        int result = users.stream()
                .reduce(0,
                        (partialAgeResult, user) -> partialAgeResult + user.age(),
                        (t, u) -> Integer.sum(t, u));

        System.out.println(result);
    }
}
