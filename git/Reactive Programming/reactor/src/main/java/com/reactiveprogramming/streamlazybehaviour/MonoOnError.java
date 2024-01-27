package com.reactiveprogramming.streamlazybehaviour;

import com.reactiveprogramming.courseutil.Util;
import reactor.core.publisher.Mono;

public class MonoOnError {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("ball").
                                    map(s -> s.length()).
                                    map(l -> l/2);


        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
