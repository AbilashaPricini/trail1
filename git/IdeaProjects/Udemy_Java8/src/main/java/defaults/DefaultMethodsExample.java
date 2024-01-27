package defaults;

import data.Student;
import data.StudentDatabase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodsExample {
    public static void main(String[] args) {

        List<String> studentList = StudentDatabase.getAllStudent()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        //prior java 8
        //Collections.sort(studentList);
        //java 8
        studentList.sort(Comparator.naturalOrder());
        System.out.println(studentList);



    }
}
