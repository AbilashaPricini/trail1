package numbericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxingExample {
    public static List<Integer> boxing(){
        //int -> integer
        return IntStream.rangeClosed(1, 10) // 1, 2, 3, 4....10
                .boxed() // [1, 2, 3, 4....10]
                .collect(Collectors.toList());
    }

    public static void unBoxing(List<Integer> integers){
        //Integer to int
        integers.stream()
                .mapToInt(Integer::intValue)
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        System.out.println("Boxing : " + boxing());
        unBoxing(boxing());

    }
}
