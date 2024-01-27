package lamdas;

import java.sql.SQLOutput;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //using java 8 - lambda

        Runnable runnable1 =  () -> System.out.println("Inside Runnable - java 8");

        new Thread(runnable1).start();

        new Thread(() -> System.out.println("Inside Runnable 3")).start();
    }
}
