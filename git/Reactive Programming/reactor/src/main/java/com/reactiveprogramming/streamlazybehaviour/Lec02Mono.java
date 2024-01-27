package com.reactiveprogramming.streamlazybehaviour;

import reactor.core.publisher.Mono;

public class Lec02Mono {

    public static void main(String[] args) {

        //publisher
        Mono<Integer> mono =  Mono.just(1);

        System.out.println(mono); //returns toString method

        mono.subscribe(val -> System.out.println(val));
    }

}
