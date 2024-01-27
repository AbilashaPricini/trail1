package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        //student name and their activities in a map
        //name as key, activities as value

        Predicate<Student> studentGrade = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGpa = student -> student.getGpa()>8.5;

        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.stream()
                //.filter(student -> student.getGradeLevel()>=3 && student.getGpa()>8.5)
                .peek(student -> System.out.println(student))
                .filter(studentGrade.and(studentGpa))
                .peek(student -> System.out.println("after 1st filter : " + student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities))
                .forEach((name, activities) -> System.out.println(name + " : " + activities));
    }
}
