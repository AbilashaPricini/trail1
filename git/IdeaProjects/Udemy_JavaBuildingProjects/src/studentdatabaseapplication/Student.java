package studentdatabaseapplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private static int id = 1000;
    private String courses = "";
    private int courseCost = 600;
    private int tuitionFee;
    private int tuitionBalance;
    private int feesPaid;

    public Student(){
        System.out.print("Enter student first name : ");
        Scanner in = new Scanner(System.in);
        this.firstName = in.next();
        //System.out.println(firstName);

        System.out.print("Enter student last name : ");
        Scanner in1 = new Scanner(System.in);
        lastName=in1.next();
        //System.out.println(lastName);

        System.out.println("1 - FirstYear \n2 - Second year \n3 - Third year \n4 - Final year \nEnter the student year : ");
        Scanner in2 = new Scanner(System.in);
        year=in2.nextInt();

        setStudentId();
        //System.out.println(firstName + " " + lastName + " " + year + " " + studentId);

    }

    public void setStudentId(){
        id++; //1002
        this.studentId =  year + "" + id; //11002
    }

    public void enrollCourses(){
        System.out.println("Please enroll the courses (Q to Quit) : ");
        String course = "";
        do{
            Scanner in = new Scanner(System.in);
            course = in.next();
            if(!course.equals("Q")){
                this.courses = courses + " " + course;
                tuitionFee = tuitionFee + courseCost;
            }
            else{ break; }
        }while(1 != 0);
        //System.out.println("Enrolled Courses : " + courses + " ");
        //System.out.println("Tuition fees : " + tuitionFee);
    }

    public void setPayment(){
        System.out.print("Enter the amount to pay $: ");
        Scanner in = new Scanner(System.in);
        feesPaid = in.nextInt();
        tuitionBalance = tuitionFee - feesPaid;
        //System.out.println("You made a payment for $" + payment);
        //System.out.println("Your tuition balance is $" + tuitionBalance);
    }

    public String toString() {
        return "Name : " + firstName + " " + lastName +
                "\nYear : " + year +
                "\nStudent Id : " + studentId +
                "\nCourse enrolled : " + courses +
                "\nTuition fee : " + tuitionFee +
                "\nFee paid : " + feesPaid +
                "\nTuition balance : " + tuitionBalance;
    }
}