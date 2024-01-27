package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionStudentExample {
    public static void main(String[] args) {
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicateStudent) -> {
            Map<String, Double> studentGradeMap = new HashMap<>();
            students.forEach(student -> {
                if(predicateStudent.test(student)) {
                    studentGradeMap.put(student.getName(), student.getGpa());
                }
            });
            return studentGradeMap;
        };

        Map<String, Double> mapRes = biFunction.apply(StudentDatabase.getAllStudent(), PredicateStudentExample.studentGrade);
        System.out.println(mapRes);
    }
}
