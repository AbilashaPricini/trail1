import java.util.*;

public class SortListOfDecimalsInReverseOrder {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(89.23, 99.23, 56.84, 11.54);
        //prior to java 8
        Comparator<Double> doubleComparator = Collections.reverseOrder();
        Collections.sort(doubleList, doubleComparator);
        System.out.println(doubleList);

        //after java 8
        doubleList.stream().sorted(Collections.reverseOrder()).forEach(n->System.out.println(n));

        /*Comparator<List<Double>> doubleComparator = new Comparator<>() {
            @Override
            public int compare(List<Double> d1, List<Double> d2) {
                return d1.compareTo(d2);
            }
        };

        doubleComparator.compare(doubleList);*/

        /*Set<Double> doubleSet = new TreeSet<>(doubleList);
        for(Double d : doubleSet){
            System.out.println(d);
        }*/

        //doubleList.stream().sorted().forEach((n)->System.out.println(n));
    }
}
