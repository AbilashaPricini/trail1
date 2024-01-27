package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class PredicateStudentExample {
    static Predicate<Student> studentGrade = (student) -> student.getGradeLevel()>=3;
    static Predicate<Student> studentGpa = student -> student.getGpa()>=8;
    static List<Student> studentList = StudentDatabase.getAllStudent();
    public static void main(String[] args) {
        filterByStudentGrade();
        filterByStudentGpa();
        filterByStudentGradeAndGpa();
        filterByStudentGradeOrGpa();
        filterByNegate();
    }

    public static void filterByStudentGrade(){
        System.out.println("filterByStudentGrade : ");
        studentList.forEach(student -> {
            if(studentGrade.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterByStudentGpa(){
        System.out.println("filterByStudentGpa : ");
        studentList.forEach(student -> {
            if(studentGpa.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterByStudentGradeAndGpa(){
        System.out.println("filterByStudentGradeAndGpa : ");
        studentList.forEach(student -> {
            if(studentGrade.and(studentGpa).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterByStudentGradeOrGpa(){
        System.out.println("filterByStudentGradeOrGpa : ");
        studentList.forEach(student -> {
            if(studentGrade.or(studentGpa).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterByNegate(){
        System.out.println("filterByNegate : ");
        Consumer<Student> con = student -> {
            if(studentGrade.and(studentGpa).negate().test(student)){
                System.out.println(student);
            }
        };
        con.accept(new Student("myna", 2, 5, "female", Arrays.asList("story telling")));
        studentList.forEach(con);
    }
}
