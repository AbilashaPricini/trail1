package stream_terminaloperations;

import data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static long counting(){
        //return StudentDatabase.getAllStudent().size();
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.counting());
    }

    public static long counting_filter(){
        return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(counting());
        System.out.println(counting_filter());
    }

}
