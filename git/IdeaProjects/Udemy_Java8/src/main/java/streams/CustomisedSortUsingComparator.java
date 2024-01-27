package streams;

import data.Student;
import data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CustomisedSortUsingComparator {
    public static List<Student> sortByStudentName(){
        return StudentDatabase.getAllStudent().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortByStudentGpa(){
        return StudentDatabase.getAllStudent().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortByStudentGpaDesc(){
        return StudentDatabase.getAllStudent().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("sortByStudentName : ");
        sortByStudentName().forEach(student -> System.out.println(student));
        System.out.println("sortByStudentGpa : ");
        sortByStudentGpa().forEach(System.out::println);
        System.out.println("sortByStudentGpaDesc : ");
        sortByStudentGpaDesc().forEach(System.out::println);
    }
}
