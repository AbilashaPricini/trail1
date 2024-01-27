package parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::perfromSum);//500500

        System.out.println(sum.getTotal());

        /*int addition = IntStream.rangeClosed(1, 1000)
                .parallel()
                .sum();
        System.out.println(addition); //500500*/
    }
}
