package numbericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    /*public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1, 5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(Collectors.toList()); // result is [1, 2, 3, 4, 5]
    }*/

    public static long mapToLong(){
        return IntStream.rangeClosed(1, 5)
                .mapToLong(i -> i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1, 5)
                .mapToDouble(i -> i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("maptoLong : " + mapToLong());
        System.out.println("maptoDouble : " + mapToDouble());
    }
}
