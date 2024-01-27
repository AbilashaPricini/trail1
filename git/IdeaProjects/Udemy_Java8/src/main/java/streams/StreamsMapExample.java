package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {
    public static void main(String[] args) {
        // input - List<Student> ; output - List<String>
        System.out.println(printNames());
        System.out.println(printNamesSet());

    }

    public static List<String> printNames(){
        return StudentDatabase.getAllStudent().stream()
                .map(Student::getName)
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toList());
    }

    public static Set<String> printNamesSet(){
        return StudentDatabase.getAllStudent().stream()
                .map(Student::getName)
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toSet());
    }
}
