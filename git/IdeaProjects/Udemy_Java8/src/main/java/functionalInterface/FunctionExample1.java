package functionalInterface;

import java.util.function.Function;

public class FunctionExample1 {
    public static String performComcat(String str){
        String str1 = FunctionExample.addSomeString.apply(str);
        return str1;
    }

    public static void main(String[] args) {
         /*String str = FunctionExample.addSomeString.apply("Abilasha");
         System.out.println(str);*/
        String res = performComcat("Abilasha");
        System.out.println(res);
    }
}
