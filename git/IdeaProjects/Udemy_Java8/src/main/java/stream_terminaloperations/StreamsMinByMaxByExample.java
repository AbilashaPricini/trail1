package stream_terminaloperations;

import data.Student;
import data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {
    public static Optional<Student> minBy_Example(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_Example(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        //System.out.println("minBy_Example - " + minBy_Example().get());
        minBy_Example().ifPresent(System.out::println);
        maxBy_Example().ifPresent(System.out::println);
    }
}
