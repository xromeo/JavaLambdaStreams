package reduce;

import java.util.Arrays;
import java.util.List;

public class ThrowingHandlingExceptions {
 public static void main(String[] args) {
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
   int divider = 2;

   // This will work, as long as the divider variable is not zero. But if it is zero, reduce() will throw an ArithmeticException exception: divide by zero.
   int result = numbers.stream().reduce(0, (a,b) -> a / divider + b / divider);

   System.out.println(result);

   int divider2 = 0;

   numbers.stream()
   .reduce(0, (a, b) -> {
       try {
           return a / divider2 + b / divider2;
       } catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception: Division by Zero");
       }
       return 0;
   });

 }

}
