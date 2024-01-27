package optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static boolean isPresentDemo(){
        Optional<String> stringOptional = Optional.ofNullable("hello");
        boolean val =  stringOptional.isPresent();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }
        return val;
    }

    public static void ifPresentDemo(){
       Optional<String> optionalString = Optional.of("Hello");
       optionalString.ifPresent(s -> System.out.println(s));

    }

    public static void main(String[] args) {
        System.out.println(isPresentDemo());
        ifPresentDemo();
    }
}
