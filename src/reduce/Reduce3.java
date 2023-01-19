package reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce3 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
        // int computedAges = users.stream().reduce(0, (partialAgeResult, user) ->
        // partialAgeResult + user.getAge());

        /*
         * In this case, we have a stream of User objects, and the types of the
         * accumulator arguments are Integer and User. However, the accumulator
         * implementation is a sum of Integers, so the compiler just can't infer the
         * type of the user parameter.
         * 
         * We can fix this issue by using a combiner:
         */

        int result = users.stream()
                .reduce(0,
                        (partialAgeResult, user) -> partialAgeResult + user.age(),
                        (t, u) -> Integer.sum(t, u));

        System.out.println(result);
        // To put it simply, if we use sequential streams and the types of the accumulator arguments and the types of its implementation match, we don't need to use a combiner.
    }
}
