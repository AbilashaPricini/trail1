import java.util.Arrays;

public class SmallestNumInArray {
    public static void main(String[] args) {
        int array[] = {43, 98, 123, 430, 23, 86};

        /*int small = Arrays.stream(array).boxed().sorted().findFirst().get();
        System.out.println(small);*/

        int small = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<small){
                small = array[i];
            }
        }
        System.out.println(small);

    }
}
