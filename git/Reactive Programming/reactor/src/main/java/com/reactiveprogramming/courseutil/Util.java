package com.reactiveprogramming.courseutil;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class Util {

    public static final Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext(){
        return o -> System.out.println("Received : " + o);
    }

    public static Consumer<Throwable> onError(){
        return e -> System.out.println("Error : " + e.getMessage());
    }

    public static Runnable onComplete(){
        return () -> System.out.println("Completed");
    }

    public static Faker faker(){
        return FAKER;
    }

    public static void sleepSeconds(int seconds){
        try {
             Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
