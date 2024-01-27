package optional;

import data.Student;
import data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseOrElseGetOrElseThrow {
    //orElse
    public static String orElseDemo(){
       Optional<Student> studentOptional = Optional.ofNullable(null); //return Optional.empty object
       String value = studentOptional.map(Student::getName).orElse("default");
       return value;
    }
    //orElseGet
    public static String orElseGetDemo(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseGet(() -> "Default");
    }
    //orElseThrow
    public static String orElseThrowDemo() {
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("no data found"));
    }

    public static void main(String[] args){
        System.out.println("orElse : " + orElseDemo());
        System.out.println("orElseGet : " + orElseGetDemo());
        System.out.println("orElseThrow : " + orElseThrowDemo());
    }
}
