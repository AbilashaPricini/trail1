package org.example;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String args[]){
        //Imperative

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,4,5,6,7,8,9,9,9);
        List<Integer> newList = new ArrayList<>();

        for(Integer integer : list){
            if(!newList.contains(integer)){
                newList.add(integer);
            }
        }

        System.out.println(newList);


        //Declarative

        List<Integer> uniquelist = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniquelist);

    }
}
