package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("kaveri", 1, 4.8, "female", Arrays.asList("walking", "Jogging"));
        };

        Student s = studentSupplier.get();
        System.out.println(s);

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudent();
        System.out.println(listSupplier.get());
    }

}
