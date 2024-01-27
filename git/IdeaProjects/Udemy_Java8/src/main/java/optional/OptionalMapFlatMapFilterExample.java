package optional;

import data.Student;
import data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapFilterExample {
    static Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
    static Optional<Student> studentOptionalNull = Optional.ofNullable(null);
    //map
    public static void optionalMap(){
        studentOptionalNull.map(Student::getName)
                .ifPresent(s -> System.out.println(s));
    }
    //flatMap
    public static void optionalFlatMap(){
        studentOptional
                .flatMap(Student::getBike)
                .map(Bike::getModel)
                .ifPresent(s -> System.out.println("BikeName : " + s));

    }
    //filter
    public static void optionalFilter(){

        studentOptional.filter(student -> student.getGpa()>=3)
                .ifPresent(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
