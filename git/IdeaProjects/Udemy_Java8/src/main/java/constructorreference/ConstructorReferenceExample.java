package constructorreference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        Function<String, Student> stringFunction = Student::new;

        System.out.println(studentSupplier.get());
        System.out.println(stringFunction.apply("abc"));
    }
}
