package streams;

import data.Student;
import data.StudentDatabase;
import java.util.function.Function;

public class StreamsExample {
    public static void main(String[] args) {
        Function<Student, String> func = student ->{
            String s = student.getName();
            return s;
        };

        System.out.println(func.apply(StudentDatabase.studentSupplier.get()));

        Function<Student, String> func1 = Student::getName;
        System.out.println(func1.apply(StudentDatabase.studentSupplier.get()));
    }
}
