import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(100, 500, 300, 100);

        StreamsExample st = new StreamsExample();

        System.out.print("even numbers : ");
        st.findEvenNumbers(integerList).forEach(n -> System.out.print(n + " "));

        System.out.print("\nNumStartsWith1 : ");
        st.NumStartWith1(integerList);

        System.out.print("\nduplicate value : ");
        st.findDuplicates(integerList);

        System.out.print("\nduplicate value using streams : ");
        st.findDuplicateUsingStream(integerList);

        st.findFirstElement(integerList);

        st.findTotalNumOfElements(integerList);

        st.SumOfList(integerList);

        st.FindMaximum(integerList);


    }
}
