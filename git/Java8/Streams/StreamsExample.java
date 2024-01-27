/*
* Given a list of integers, find out all the even numbers that exist in the list
*  using Stream functions?
*/

import java.util.*;

public class StreamsExample {
    //List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

    public List<Integer> findEvenNumbers(List<Integer> integerList){
        return integerList.stream()
                .filter(n -> n%2==0)
                .toList();
    }

/*
 Given a list of integers, find out all the numbers starting with 1 using
 Stream functions?
 */

    public void NumStartWith1(List<Integer> list){ // (23,43,13,65,78,98,100)
        list.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1", 0))
                .forEach(n -> System.out.print(n + " "));

    }

/*How to find duplicate elements in a given integers list in
java using Stream functions?
*/

    public void findDuplicates(List<Integer> list){
        Set<Integer> set = new HashSet<>();

        for(Integer i : list){
            if(!set.add(i))
                System.out.print(i + " ");
        }
    }

    public void findDuplicateUsingStream(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        list.stream()
                .filter( i -> (!set.add(i)))
                .forEach(n -> System.out.print(n + " "));
    }

/*
 Given the list of integers, find the first element of the list
 using Stream functions?
*/
    public void findFirstElement(List<Integer> list){
        int firstElement = list.stream()
                .findFirst().get();
        System.out.println("\nFirst element in strem : " + firstElement);

    }

/*Given a list of integers, find the total number of elements present
in the list using Stream functions?
*/

    public void findTotalNumOfElements(List<Integer> list){
        Long count = list.stream().count();
        System.out.println("count : " + count);
    }

    public void SumOfList(List<Integer> list){
        int sum = list.stream()
                .reduce((a,b) -> a+b).get();
        System.out.println("Total : " + sum);
    }

    public void FindMaximum(List<Integer> list){
        int max = list.stream()
                .max(Integer::compare)
                .get();
        System.out.println("max : " + max);
    }
}
