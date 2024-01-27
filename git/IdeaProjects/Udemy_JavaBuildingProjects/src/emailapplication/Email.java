package emailapplication;

import java.util.List;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String companySuffix;
    private String password;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String email;
    private String alternateEmailAddress;

    // constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = setFirstName();
        this.lastName = setLastName();
        //System.out.println(firstName + " " + lastName);

        // call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println(this.department);

        this.companySuffix = setCompanyName();
        //System.out.println(this.companySuffix);

        // call a method that returns a random password
        this.password = setPassword(defaultPasswordLength);
        System.out.println("your password is " + this.password);

        //combine elements to generate email
        this.email = this.firstName.toLowerCase() + "." +
                this.lastName.toLowerCase() + "@" + department.toLowerCase() + "." +
                companySuffix.toLowerCase() + ".com";
        //System.out.println(email);
    }

    // ask for the department
    // sales, development, accounting, none
    private String setDepartment(){
        System.out.println("Welcome! New Joiner : " + firstName + "\nEnter the Department code \n1 for Sales \n2 for Development " +
                "\n3 for Accounting \n0 for none \nEnter the department code : ");

        Scanner input = new Scanner(System.in);
        int deptCode = input.nextInt();

        if(deptCode == 1)
            return "Sales";
        if(deptCode == 2)
            return "Development";
        if(deptCode == 3)
            return "Accounting";
        else
            return "Please enter the correct Department Code to proceed further :)";
    }

    //generate random password
    private String setPassword(int length){
        String passwordFrom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@##$%";
        char[] password = new char[length];
        for(int i=0; i<password.length; i++){
            int randomValue = (int) (Math.random() * passwordFrom.length());
            password[i] = passwordFrom.charAt(randomValue);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //set the altername email
    public void setAlternateEmailAddress(String altEmail){
        this.alternateEmailAddress = altEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return this.mailBoxCapacity;
    }

    public String getAlternateEmailAddress(){
        return this.alternateEmailAddress;
    }

    public String getChangePassword(){
        return this.password;
    }

    public String setCompanyName(){
        System.out.println("Enter the company name : ");
        Scanner in = new Scanner(System.in);
        String companyName = in.next();
        return companyName;
    }

    public String setFirstName(){
        System.out.println("Enter the first name : ");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        return firstName;
    }

    public String setLastName(){
        System.out.println("Enter the last name : ");
        Scanner in = new Scanner(System.in);
        String lastName = in.next();
        return lastName;
    }

    public String showInfo(){
        return "DISPLAY NAME : " + firstName + " " + lastName +
                "\nCOMPANY EMAIL : " + email +
                "\nMAILBOX CAPACITY : " + mailBoxCapacity + "mb";
    }


}
