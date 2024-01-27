package parallelstream;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities =  StudentDatabase.getAllStudent().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities =  StudentDatabase.getAllStudent()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime-startTime));
        return studentActivities;
    }


    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
