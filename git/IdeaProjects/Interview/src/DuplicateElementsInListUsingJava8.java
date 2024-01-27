import java.util.*;

public class DuplicateElementsInListUsingJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55,44,55,99,33,22,66,33,77);
        //List<Integer> newList = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        for(Integer i : list){
            if(!set.add(i)){ //returns boolean
                System.out.print(i + " ");
            }
        }
    }
}
