import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        int array[] = {43, 98, 123, 430, 23, 86};
        int temp;

        //Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).forEach(n -> System.out.print(n + " "));
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }

    }
}
