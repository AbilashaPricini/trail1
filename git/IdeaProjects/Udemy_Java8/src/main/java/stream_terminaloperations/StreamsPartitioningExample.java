package stream_terminaloperations;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsPartitioningExample {

    public static void partitioningBy_1(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=8;
        Map<Boolean, List<Student>> partition_1 = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.partitioningBy(studentPredicate));
        System.out.println(partition_1);
    }

    public static void partitionBy_2(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=8;
        Map<Boolean, Set<Student>> partition_2 = StudentDatabase.getAllStudent().stream()
                .collect(partitioningBy(studentPredicate,
                        toSet()));
        System.out.println(partition_2);
    }
    public static void main(String[] args) {
        partitioningBy_1();
        partitionBy_2();
    }
}
