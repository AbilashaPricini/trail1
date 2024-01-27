package parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (a,b) -> a+b);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in Sequential stream - " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .parallel()
                .reduce(0, (a,b) -> a+b);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in parallel stream - " + duration);
        return sum;
    }

    public static void main(String[] args) {
          List<Integer> integerList = IntStream.rangeClosed(1, 100)
                  .boxed()
                  .collect(toList());

          sequentialSum(integerList);
          parallelSum(integerList);
    }
}
