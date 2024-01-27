package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsLimitAndSkipExample {

    public static Stream<Integer> limit(List<Integer> list){
        return list.stream()
                //stream pass all the elements - 9, 3, 6, 2, 7
                .limit(2);

    }
    public static Optional<Integer> limit_reduce(List<Integer> list){
        return list.stream()
                .limit(2)
                //.reduce((a, b) -> a+b);
                .reduce(Integer::sum);
    }

    public static void skip(List<Integer> list){
         list.stream()
                //stream pass all the elements - 9, 3, 6, 2, 7
                .skip(2).
                 forEach(System.out::println);

    }

    public static Optional<Integer> skip_reduce(List<Integer> list){
        return list.stream()
                //stream pass all the elements - 9, 3, 6, 2, 7
                .skip(2)
                .reduce((a, b) -> a + b);

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9, 3, 6, 2, 7);
        List<Integer> integerList1 = new ArrayList<>();
        limit(integerList).forEach(System.out::println);

        Optional<Integer> limitOptional = limit_reduce(integerList1);
        //limitOptional.ifPresent(System.out::println);
        if(limitOptional.isPresent()){
            System.out.println(limitOptional.get());
        }else {
            System.out.println("no list is found");
        }

        System.out.println("============ SKIP =============");
        skip(integerList);
        if(skip_reduce(integerList).isPresent()){
            System.out.println(skip_reduce(integerList).get());
        }else{
            System.out.println("no list is found");
        }


    }
}
