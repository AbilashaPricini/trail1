package functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //if input and output are same
        UnaryOperator<String> unaryOperator = str -> str.concat("default");
        System.out.println(unaryOperator.apply("abilasha"));
    }
}
