package streams;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        //student name and their activities in a map
        //name as key, activities as value

        Function<Student, String> func1 = (student) -> {
            String str = student.getName();
            return str;
        };

        Function<Student, List<String>> func2 = Student::getActivities;
                /*(student) -> {
            List<String> str = student.getActivities();
            return str;
        };*/

        List<Student> studentList = StudentDatabase.getAllStudent();
        //studentList.stream().collect(Collectors.toMap(Student::getName, Student::getActivities));
        Map<String, List<String>> studentMap = studentList.stream().collect(Collectors.toMap(func1, func2));
        System.out.println(studentMap);
    }
}
