package methodreference;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    public static void main(String[] args) {
        Consumer<Student> consumer = System.out::println;

        //StudentDatabase.getAllStudent().forEach(consumer);
        listOfActivities(StudentDatabase.getAllStudent());
    }

    public static void listOfActivities(List<Student> students){
        Consumer<Student> consumer = Student::printActivities;
        students.forEach(consumer);
    }
}
