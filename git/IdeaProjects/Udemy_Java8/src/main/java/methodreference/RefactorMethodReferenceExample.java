package methodreference;

import data.Student;
import data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel3;

        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }

    public static boolean greaterThanGradeLevel3(Student s){
       return s.getGradeLevel()>=3;
    }
}
