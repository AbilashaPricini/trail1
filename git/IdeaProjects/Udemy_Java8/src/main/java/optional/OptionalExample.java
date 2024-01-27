package optional;

import data.Student;
import data.StudentDatabase;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
        Student student = null;//StudentDatabase.studentSupplier.get(); //null - nullpointerexception occurs
        String name = student.getName();
        if(student != null) {
            return name;
        }else{
            System.out.println("not found !");
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get()); //null - name not found
        if(studentOptional.isPresent()){
            return studentOptional
                    .map(Student::getName);
        }

        return Optional.empty(); //represents optional.optional object with no value
    }

    public static void main(String[] args) {

        //System.out.println("Length of the Student name is " + getStudentName().length());
        /*String name = getStudentName();
        if(name != null)
        System.out.println("Length of the Student name is " + name.length());
        else
            System.out.println("Name not found !");*/

        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get().length());
        }else{
            System.out.println("Name not found!");
        }

    }
}
