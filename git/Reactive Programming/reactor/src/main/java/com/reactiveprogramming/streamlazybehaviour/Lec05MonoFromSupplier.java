package com.reactiveprogramming.streamlazybehaviour;

import com.reactiveprogramming.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lec05MonoFromSupplier {
    public static void main(String[] args) {

       // Mono<String> mono = Mono.just(getName());

        Supplier<String> stringSupplier = () -> getName();
        Mono<String> mono = Mono.fromSupplier((stringSupplier));
        mono.subscribe(
                Util.onNext()
        );

        Callable<String> stringCallable = () -> getName();
        Mono.fromCallable(stringCallable).subscribe(
                Util.onNext()
        );


    }

    public static String getName(){
        System.out.println("Generating names...");
        return Util.faker().name().fullName();
    }
}
