package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        //consumer.accept("abilashasubramani");



        printName();
        //printNameAndActivities();
        //printGradeGreaterThan3();

    }

    static Consumer<Student> cname =(name) -> System.out.println(name.getName());
    static Consumer<Student> cactivities = (activites) -> System.out.println(activites.getActivities());

    public static void printName(){
        //Consumer<Student> studentConsumer = (student) -> System.out.println(student);
        //StudentDatabase sd = new StudentDatabase();
        List<Student> studentList = StudentDatabase.getAllStudent();
        studentList.forEach(cname);


    }

    public static void printNameAndActivities(){
        List<Student> stud = StudentDatabase.getAllStudent();


        /*Consumer<Student> consumer = (student) -> {
                System.out.print(student.getName());
                System.out.println(student.getActivities());
        };*/

        stud.forEach(cname.andThen(cactivities));

    }

    public static void printGradeGreaterThan3(){
        List<Student> stud = StudentDatabase.getAllStudent();
        Consumer<Student> cstud = (student) -> System.out.print(student.getName() + student.getActivities() + " ");
        stud.stream().filter((student -> student.getGradeLevel()>=3 && student.getGpa()>=8)).forEach(cstud);

        /*stud.forEach(student ->
        {
            if(student.getGradeLevel()>=3){
                cname.andThen(cactivities).accept(student);
            }
        });*/


    }
}
