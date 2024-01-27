package lamdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //prior to java 8
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        int value = com.compare(5,3);
        System.out.println("prior to java 8 : " + value);

        //after java 8

        Comparator<Integer> comLambda = (a, b) -> a.compareTo(b);
        System.out.println("after java 8 : " + comLambda.compare(5,3));
    }
}
