package lamdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    static int i=4;
    public static void main(String[] args) {
        //int i =4;

        Consumer<Integer> con = i1 -> {
            i++;
            System.out.println(i+i1);
        };

        //i++;

        con.accept(7);
    }
}
