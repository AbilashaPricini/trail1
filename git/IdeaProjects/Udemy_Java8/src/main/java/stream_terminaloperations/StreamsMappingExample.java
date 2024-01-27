package stream_terminaloperations;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {

        List<String> namesList = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        Set<String> namesSet = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        //prior we used
        List<String> listStudent = StudentDatabase.getAllStudent().stream()
                        .map(Student::getName)
                                .collect(Collectors.toList());

        System.out.println("namesList - " + namesList);
        System.out.println("namesSet - " + namesSet);
        System.out.println("listStudent - " + listStudent);

    }
}
