package stream_terminaloperations;

import data.Student;
import data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static int sum(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double avarage(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum :" + sum());
        System.out.println("avg :"  + avarage());
    }
}
