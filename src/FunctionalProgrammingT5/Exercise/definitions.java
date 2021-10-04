package FunctionalProgrammingT5.Exercise;

import java.util.function.*;

public class definitions {
    public static void main(String[] args) {
// takes Integer and returns Integer <takes, returns> use with .apply();
        Function<Integer, Integer> power2 = number -> number * number;

//Consumer <takes dataType> and does not return (void) .accept();
        Consumer<String> printWord = word -> System.out.println(word);
        //printWord.accept("Fuck OFF !!!");
//Supplier <returnType> -> .get();
        Supplier<Integer> date = () -> 30;
//Predicate<inputDataType> returns true///false -> .test();
        Predicate<String> isEquals = word -> word.equals("Test");

        //BiFunction<input,input,return> -> .apply();
        BiFunction<Integer, Integer, String> test = (num1,num2) -> String.valueOf(num1+num2);



    }
}
