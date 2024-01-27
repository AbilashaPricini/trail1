package numbericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
    public static int sumOfNumbers(List<Integer> list){
        return list.stream()
                .reduce(0, (a,b) -> a+b); //unboxing to convert Interger to int
    }

    public static int sumOfNumbers_IntStream(){
        return IntStream.rangeClosed(1, 9)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,5,6,7);
        System.out.println(sumOfNumbers(integerList));

        System.out.println(sumOfNumbers_IntStream());
    }
}
