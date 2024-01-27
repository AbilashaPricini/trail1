package lamdas;

import java.util.function.Consumer;

public class LambdaVariable{
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> con = (i1) -> {
            //i = 2;
            System.out.println(i); //(i) - can't pass i as argument as it declared already(local variable)
        };
        con.accept(8);
    }
}
