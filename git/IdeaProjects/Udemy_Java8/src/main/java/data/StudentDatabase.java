package data;

import optional.Bike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        //Student student = new Student();
        Bike bike = new Bike();
        bike.setName("Royal Enfield");
        bike.setModel("Himalaya");
        Student student = new Student("Abilasha", 2, 3.6, "female", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        student.setBike(Optional.ofNullable(bike));

        return student;
    };
    public static List<Student> getAllStudent(){
        //List<Student> studentDB = new ArrayList<>();

        //grade 2
        Student s1 = new Student("Abilasha", 2, 3.6, "female", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        Student s2 = new Student("subbar", 2, 5.5, "male", Arrays.asList("swimming", "gymnastics", "soccer"), 14);
        //grade 3
        Student s3 = new Student("pranav", 3, 6.2, "male", Arrays.asList("swimming", "soccer", "basketball"), 9);
        Student s4 = new Student("pranika", 3, 8.7, "female", Arrays.asList("swimming", "dancing", "drawing"), 12);
        //grade 4
        Student s5 = new Student("vinitha", 4, 9.2, "female", Arrays.asList("swimming", "cricket", "video games"), 15);
        Student s6 = new Student("tara", 4, 9.8, "male", Arrays.asList("studying", "watching", "swimming"), 18);

        return Arrays.asList(s1,s2,s3,s4,s5,s6, null);
    }
}
