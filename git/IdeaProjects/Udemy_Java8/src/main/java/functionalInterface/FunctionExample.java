package functionalInterface;

import java.util.function.Function;

public class FunctionExample {

    //static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        Function<String, String> function = (name) -> name.toUpperCase();
        System.out.println(function.apply("abilashasubramani"));
        System.out.println("andThen() - " + function.andThen(addSomeString).apply("abilashasubramani"));
        System.out.println("compose() - " + function.compose(addSomeString).apply("abilashasubramani"));

    }
}
