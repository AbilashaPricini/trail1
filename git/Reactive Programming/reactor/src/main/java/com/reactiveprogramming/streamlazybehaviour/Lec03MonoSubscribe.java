/*
* onNext - Consumer<T>
* onError - Consumer<Throwable>
* onComplete - Runnable
* */

package com.reactiveprogramming.streamlazybehaviour;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

    public static void main(String[] args) {
        //publisher
        Mono<String> mono = Mono.just("ball");

        //1
        mono.subscribe(); //publisher emits but does not return value

        mono.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );
    }
}
