package streams;

import data.StudentDatabase;

public class StreamsMatchExample {
    public static boolean anyMatchDemo(){
        return StudentDatabase.getAllStudent().stream()
                .anyMatch(student -> student.getGpa()>=8.5);
    }

    public static boolean allMatchDemo(){
        return StudentDatabase.getAllStudent().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean noneMatchDemo(){
        return StudentDatabase.getAllStudent().stream()
                .noneMatch(student -> student.getGpa()>=10);
    }
    public static void main(String[] args) {
        System.out.println("Any match : " + anyMatchDemo());
        System.out.println("All match : " + allMatchDemo());
        System.out.println("None match : " + noneMatchDemo());
    }
}
