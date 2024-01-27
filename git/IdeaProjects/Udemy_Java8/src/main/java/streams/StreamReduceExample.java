package streams;

import data.Student;
import data.StudentDatabase;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int performMultiplication(List<Integer> integers){
        return integers.stream()
                //1
                //3
                //5
                //7
                //a=1(identity), b=1(from stream) -> result 1 is returned , 3
                //a=1(from result), b=3(from stream) -> result 3, 9
                //a=3, b=5 -> result 15, 45
                //a=15, b=7 -> result 105, 315
                .reduce(3, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers){
        return integers.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDatabase.getAllStudent().stream()
                .reduce((stud1 , stud2) -> stud1.getGpa() > stud2.getGpa() ? stud1 : stud2);
                /*.reduce((stud1, stud2) -> {
                    if(stud1.getGpa() > stud2.getGpa()){
                        return stud1;
                    }else{
                        return stud2;
                    }
                });*/
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        List<Integer> integerList1 = new ArrayList<>();
        System.out.println(performMultiplication(integerList)); //3
        System.out.println(performMultiplicationWithoutIdentity(integerList));
        System.out.println(performMultiplicationWithoutIdentity(integerList).isPresent());//return boolean
        System.out.println(performMultiplicationWithoutIdentity(integerList).get());

        System.out.println(performMultiplicationWithoutIdentity(integerList1).isPresent()); //false
        if(performMultiplicationWithoutIdentity(integerList1).isPresent()){
            System.out.println(performMultiplicationWithoutIdentity(integerList1).get()); //avoid exception
        }

        System.out.println("StudentDatabase");
        System.out.println(getHighestGpaStudent());
        System.out.println(getHighestGpaStudent().get());
        System.out.println(getHighestGpaStudent().isPresent());

        Optional<Student> studentOptional = getHighestGpaStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
        studentOptional.ifPresent(System.out::println);


    }
}
