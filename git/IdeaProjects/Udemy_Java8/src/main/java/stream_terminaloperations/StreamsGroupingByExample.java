package stream_terminaloperations;

import data.Student;
import data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void groupStudentByGender(){
        Map<String, List<Student>> genderClassifier = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(genderClassifier);
    }

    public static void customisedGroupingBy(){
        Map<String, List<Student>> customise = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(customise);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> twoLevelGroup = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa()>=8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(twoLevelGroup);
    }

    public static void twoLevelGrouping_2(){
        Map<String, Integer> twoLevelGroup2 = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(twoLevelGroup2);
    }

    public static void threeArgumentGrouping_1(){
        LinkedHashMap<String, Set<Student>> threeArgs = StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        LinkedHashMap::new, Collectors.toSet()));

        System.out.println(threeArgs);

    }

    public static Map<Integer, Optional<Student>> topGpaBasedOnGrade_maxBy_groupingBy(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    public static Map<Integer, Student> topGpaBasedOnGrade_maxBy_groupingBy_withoutOptional(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get) ));
    }

    public static Map<Integer, Student> topGpaBasedOnGrade_minBy_groupingBy(){
        return StudentDatabase.getAllStudent().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
                        Optional::get)));
    }



    public static void main(String[] args) {
        /*groupStudentByGender();
        customisedGroupingBy();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGrouping_1();*/
        /*System.out.println(topGpaBasedOnGrade_maxBy_groupingBy());
        System.out.println(topGpaBasedOnGrade_maxBy_groupingBy_withoutOptional());*/

        System.out.println(topGpaBasedOnGrade_minBy_groupingBy());


    }
}
