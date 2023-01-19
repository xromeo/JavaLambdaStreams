package lambda;

// There is no need to add parameter types 
// Reduce single statement bodies
// Drop the parentheses for single params
// Parentheses are required for empty params

public class syntax {

    @FunctionalInterface
    interface Converter<T, R>{
        R apply (T source);
    }

    public static void main(String[] args) {
      Converter<String, Boolean> converter = (s) -> {return Boolean.parseBoolean(s);};
      
      System.out.println(converter.apply("TRUE"));
      System.out.println(converter.apply("tRue"));
      System.out.println(converter.apply("true"));
      System.out.println(converter.apply("false"));
      System.out.println(converter.apply("False"));
      System.out.println(converter.apply("No"));
      System.out.println(converter.apply("null"));

      System.out.println();

      Converter<String, Boolean> converter3 = s -> Boolean.parseBoolean(s);
      System.out.println(converter3.apply("tRUE"));
      
      System.out.println();
      
      Converter<Boolean, Integer> converter2 = b -> b ? 1:0;
      System.out.println(converter2.apply(true));

    }

    String doSomething(String txt){
        return txt.toUpperCase();
    }
}
