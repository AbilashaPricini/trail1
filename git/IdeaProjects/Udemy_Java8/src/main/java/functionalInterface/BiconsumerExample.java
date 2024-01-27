package functionalInterface;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a : " + a + ", " + "b : " + b);
        };

        biConsumer.accept("java 7", "java 8");

        BiConsumer<Integer, Integer> mutliply = (a, b) -> {
            System.out.println("Mul : " + a*b);
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Div : " + a/b);
        };

        mutliply.andThen(division).accept(10, 5);

        nameAndActivities();

    }

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + ": " + activities);
        };

        List<Student> list = StudentDatabase.getAllStudent();

        //list.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
        list.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

}
