package streams;

import data.Student;
import data.StudentDatabase;

import java.util.Optional;

public class StreamFindAnyFirstExample {
    public static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGpa()>=6)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){ // difference only in parallel stream
        return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGpa()>=10)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAny = findAnyStudent();
        if(findAny.isPresent()){
            System.out.println("Found the student : " + findAny.get());
        }else{
            System.out.println("Student not found !");
        }

        Optional<Student> findFirst = findFirstStudent();
        if(findFirst.isPresent()){
            System.out.println("Found the student : " + findFirstStudent().get());
        }else{
            System.out.println("Student not found !");
        }
    }
}
