import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinInListUsingJava8 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2,3,5,1,6,8,9,10);
        int max = 0;

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) > list.get(j)){
                    max = list.get(i);
                }

            }
        }
        System.out.println(max);
    }
}
