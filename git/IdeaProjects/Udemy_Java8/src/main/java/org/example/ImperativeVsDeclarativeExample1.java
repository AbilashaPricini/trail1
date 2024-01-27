package org.example;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String args[]){
        //Imperative

        int sum = 0;
        for(int i=0; i<=100; i++){
            sum = sum + i;
        }
        System.out.println("sum : " + sum);

        //Declarative

        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("sum1 : " + sum1);
    }
}
