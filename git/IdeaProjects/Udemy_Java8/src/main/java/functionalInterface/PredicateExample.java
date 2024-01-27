package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i) -> {return i%2==0;};
    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = i -> i%6==0;
    static Predicate<Integer> p3 = i -> i%3==0;
    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p1.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateAnd(){
        System.out.println("Predicate And : " +p2.and(p3).test(15));
        System.out.println("Predicate And : " +p1.and(p2).and(p3).test(18));
    }

    public static void predicateOr(){
        System.out.println("Predicate Or : " + p2.or(p3).test(9));
        System.out.println("Predicate Or : " + p2.or(p3).or(p1).test(11));
    }

    public static void predicateNegate(){
        System.out.println("Predicate Negate : " + p2.and(p3).negate().test(15));
        System.out.println("Predicate Negate : " + p2.or(p3).negate().test(9));
    }
}
