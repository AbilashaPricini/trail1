package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    public static void main(String[] args) {
        Function<List<Student>, Map<String, Double>> studentFunction = students -> {
            Map<String, Double> studentGradeMap = new HashMap<>();
            students.forEach(student -> {
                if(PredicateStudentExample.studentGrade.test(student)){
                    studentGradeMap.put(student.getName(), student.getGpa());
                }
            });
            return studentGradeMap;
        };

        List<Student> studentList = StudentDatabase.getAllStudent();
        System.out.println(studentFunction.apply(studentList));
    }
}
