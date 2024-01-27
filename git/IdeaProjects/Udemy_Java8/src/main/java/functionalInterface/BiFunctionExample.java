package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) ->{
            int c = a + b;
            return c;
        };

        BiFunction<Integer,Integer, Function<Integer, Integer>> mul = (a, b) -> {
            Function<Integer, Integer> c = (a1) -> {
                return a1.compareTo(a);
            };
            return c;
        };

        BiFunction<Integer,Integer, Integer> div = (a, b) -> {
            int c = a / b;
            return c;
        };

        System.out.println(add.apply(10, 20));
        //System.out.println(mul.andThen(add).apply(10, 20));
    }
}
