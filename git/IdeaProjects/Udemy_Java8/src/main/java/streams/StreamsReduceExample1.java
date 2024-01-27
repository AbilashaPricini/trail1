package streams;

import data.Student;
import data.StudentDatabase;

public class StreamsReduceExample1 {
    private static int noOfNoteBooks(){
        return StudentDatabase.getAllStudent().stream()
                .filter(student -> student.getGradeLevel()>=3 && student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0, (a, b) -> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
