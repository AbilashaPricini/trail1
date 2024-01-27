/* Scenario : You are a Database Administrator for a university and need ti create an application to manage student enrollments
               and balance.
   Your application should do the following:
         -> Ask the user how many new students will be added ro the database
         -> The user should be prompted ro enter the name and tear for each student
         -> The student should have a 5-digit unique ID, with the first number being their grade level
         -> A student can enroll in the following courses:
               --> History 101
               --> Mathematics 101
               --> English 101
               --> Chemistry 101
               --> Computer science 101
         -> Each course costs $600 to enroll
         -> The student should be able to view their balance and pay the tuition
         -> To see the status of the student, we should see their name, ID, courses enrolled and balance
*/

package studentdatabaseapplication;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        //provide no. of student
        System.out.print("Enter number of students to enroll : ");
        Scanner sc = new Scanner(System.in);
        int studentCount = sc.nextInt();

        Student[] students = new Student[studentCount];

        //create n number of students

        for(int i=0; i<studentCount; i++){
            students[i]= new Student();
            students[i].enrollCourses();
            students[i].setPayment();

        }

        for(int i=0; i<studentCount; i++){
            System.out.println(students[i].toString());
        }




    }
}
