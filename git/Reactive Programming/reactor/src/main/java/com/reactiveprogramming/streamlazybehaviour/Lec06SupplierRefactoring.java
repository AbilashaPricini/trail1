package com.reactiveprogramming.streamlazybehaviour;

import com.reactiveprogramming.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {
    public static void main(String[] args) {
        getName();
        getName()
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(Util.onNext());
        getName();

        Util.sleepSeconds(4);


    }


    //since the business logic is inside fromSupplier,it will execute only
    // when somebody subscribes to this
    private static Mono<String> getName(){
        System.out.println("entered getName method");
        return Mono.fromSupplier(() -> {
                     System.out.println("Generating name...");
                     Util.sleepSeconds(3);
                     return Util.faker().name().fullName();
                }).map(String::toUpperCase);
    }
}
