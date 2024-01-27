import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int a[] = {9, 77, 43, 130,  56, 24, 100};//3, 4, 5, 100, 9, 10, 33, 55, 1, 89, 187

        int secondLargeNum = Arrays.stream(a)
                .boxed()//int primitive --> Integer object
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLargeNum);
    }
}
