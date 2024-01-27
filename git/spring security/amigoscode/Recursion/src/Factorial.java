import java.util.stream.StreamSupport;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }

    public static int fact(int n){
        int mul = 1;
        for(int i=n; i>0; i--){
            mul = mul * i;
        }
        return mul;
    }
}
