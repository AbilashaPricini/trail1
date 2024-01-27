package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformance(Supplier<Integer> supplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<noOfTimes; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
    public static int sum_Sequential_Stream(){
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static int sum_Parallel_Stream(){
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        /*System.out.println(sum_Sequential_Stream());
        System.out.println(sum_Parallel_Stream());*/
        System.out.println("sequential stream result - " + checkPerformance(ParallelStreamExample::sum_Sequential_Stream, 20));
        System.out.println("parallel stream result - " + checkPerformance(ParallelStreamExample::sum_Parallel_Stream, 20));

    }
}
