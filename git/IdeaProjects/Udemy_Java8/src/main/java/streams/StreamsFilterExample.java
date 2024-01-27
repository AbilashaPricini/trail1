package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudentsByGrade(){
         return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .collect(toList());
    }

    public static List<Student> filterStudentsByGender(){
        return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("filterStudentsByGrade : ");
        filterStudentsByGrade().forEach(System.out::println);
        System.out.println("filterStudentsByGender : ");
        filterStudentsByGender().forEach(System.out::println);
    }
}
