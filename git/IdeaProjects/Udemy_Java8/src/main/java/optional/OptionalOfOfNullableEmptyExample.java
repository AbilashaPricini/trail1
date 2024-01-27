package optional;

import data.Student;
import data.StudentDatabase;

import java.util.Optional;

public class OptionalOfOfNullableEmptyExample {
    public static Optional<String> ofNullableDemo(){
        Optional<String> studentOptional = Optional.ofNullable(null); //("Hello");
        return studentOptional;
    }

    public static Optional<String> ofDemo(){
        Optional<String> stringOptional = Optional.of("Hello"); // null - exception occurs
        return stringOptional;
    }

    public static Optional<String> emptyDemo(){
        Optional<String> optionalString = Optional.empty();
        return optionalString;
    }

    public static void main(String[] args) {
        System.out.println("ofNullable : " + ofNullableDemo()); // Optional.empty
        System.out.println("of : " + ofDemo().get());
        System.out.println("empty : " + emptyDemo());

    }
}
