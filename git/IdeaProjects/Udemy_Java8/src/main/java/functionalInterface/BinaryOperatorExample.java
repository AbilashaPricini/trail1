package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //if 2 inputs and ouput is same
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(3,7));
        Comparator<Integer> com = (a, b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(com);
        System.out.println("Maximum number - " + maxBy.apply(90, 54));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(com);
        System.out.println("Minimum number - " + minBy.apply(91, 19));
    }
}
