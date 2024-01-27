package streams;

import data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //9
                //23
                //7
                //19
                //4
                // initially x = 0, y =9 -> 0>9 -> y=9 = x(result will stored in x)
                // x=9, y=23 -> 9>23 -> y=23 = x
                // x=23, y=7 -> 23>7 -> x=23
                //x=23, y=19 -> 23>19 -> x = 23
                //x=23, y =4 -> 23>4 -> x=23
                .reduce(0, (x, y) -> x > y ? x : y); // x variable holds the max value for each element in the iteration
    }

    public static int findMinValue(List<Integer> integerList){
        return integerList.stream()
                //9
                //23
                //7
                //19
                //4
                // initially x = 0, y =9 -> 0<9 -> x=0 = x(result will stored in x)
                // x=0, y=23 -> 0<23 ->  x=0
                // x=0, y=7 -> 0<7 -> x=0
                //x=0, y=19 -> 0<19 -> x = 0
                //x=0, y =4 -> 0<4 -> x=0
                .reduce(0, (x, y) -> x < y ? x : y); // x variable holds the max value for each element in the iteration


    }

    public static Optional<Integer> findMaxValue_Optional(List<Integer> integers){
        return integers.stream()
                .reduce((x, y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMinValue_Optional(List<Integer> integers){
        return integers.stream()
                .reduce((x, y) -> x<y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9, 23, 7, 19, 4, 2);
        //System.out.println(findMaxValue(integerList));

        List<Integer> integerList1 = new ArrayList<>();
        //System.out.println(findMaxValue(integerList1));

        //System.out.println(findMaxValue_Optional(integerList));
        int maxValue = findMaxValue_Optional(integerList).get();
        //System.out.println(maxValue);

        Optional<Integer> max_Optional = findMaxValue_Optional(integerList1);
        if(max_Optional.isPresent()){
            System.out.println(max_Optional.get());
        }else{
            System.out.println("List is empty");
        }

        System.out.println(findMinValue(integerList)); // result is 0
        Optional<Integer> min_value = findMinValue_Optional(integerList);
        min_value.ifPresent(System.out::println);


    }
}
