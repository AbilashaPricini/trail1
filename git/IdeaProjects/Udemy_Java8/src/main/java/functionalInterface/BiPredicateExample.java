package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    Predicate<Student> p2 = student -> student.getGpa()>=8;
    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade>=3 && gpa>=8;
    List<Student> studentList = StudentDatabase.getAllStudent();


    Consumer<Student> consumer = student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
            System.out.println(student);
    };

    public void biPredicate(){
        studentList.forEach(consumer);
    }


    public static void main(String[] args) {
        new BiPredicateExample().biPredicate();
    }
}
