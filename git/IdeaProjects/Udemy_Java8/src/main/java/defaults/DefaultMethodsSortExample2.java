package defaults;

import data.Student;
import data.StudentDatabase;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsSortExample2 {

    Consumer<Student> nameComparator = student -> System.out.println(student);

    public static void sortByName(List<Student> studentList){
        System.out.println("AFter sort : ");
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.forEach(student -> System.out.println(student));

    }

    public static void sortByGpa(List<Student> studentList){
        System.out.println("SortByGpa");
        studentList.sort(Comparator.comparingDouble(Student::getGpa));
        studentList.forEach(student -> System.out.println(student));
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("ComparatorChaining");
        studentList.sort(Comparator.comparing(Student::getGradeLevel).thenComparing(Student::getName));
        studentList.forEach(student -> System.out.println(student));
    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("After sort with null values: ");
        studentList.sort(Comparator.nullsLast(Comparator.comparing(Student::getName)));
        studentList.forEach(System.out::println);

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudent();
        System.out.println("Before Sort");
        studentList.forEach(student -> System.out.println(student));
        //sortByName(studentList);///////
        //sortByGpa(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);


    }
}
