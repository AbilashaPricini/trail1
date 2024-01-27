package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndConsumerExample {
    //instance declaration
    Predicate<Student> predicateGrade = student -> student.getGradeLevel()>=3;
    Predicate<Student> predicateGpa = student -> student.getGpa()>=8;

    BiConsumer<String , List<String>> biConsumer = (name, activites) -> System.out.println(name + " : " + activites);
    Consumer<Student> studentConsumer = student -> {
        if(predicateGrade.and(predicateGpa).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudent();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
}
