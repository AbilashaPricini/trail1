package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static void main(String[] args) {
        Function<String, String> func = str -> str.toUpperCase();

        Function<String, String> funcMR = String::toUpperCase;

        System.out.println(func.apply("abilashasubbar"));
        System.out.println(funcMR.apply("abilashasubbar"));
    }
}
