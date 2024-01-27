package streams;

import data.Student;
import data.StudentDatabase;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        //input - List<Student> ; output - List<String>
        System.out.println(printStudentActivities());
        System.out.println(printNo_Of_Activities());

    }

    public static List<String> printStudentActivities(){
        return StudentDatabase.getAllStudent().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    public static long printNo_Of_Activities(){
        return StudentDatabase.getAllStudent().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

    }
}
