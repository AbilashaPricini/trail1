package backaccountapplication;

public abstract class Account implements BaseInterestRate {
    //do want to create an object, so made as abstract

    //List common properties for savings and checking accounts
    private String name;
    private String SSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        //System.out.println("Name : " + this.name + " SSN : "  + this.SSN + " Balance : $" + balance);

        //set account number
        this.accountNumber = setAccountNumber();
        //System.out.println("Account number : " + accountNumber);
        setRate();
    }

    private String setAccountNumber(){
        //11 digits = 1 or 2(sav or che) , last 2 digits of SSN, unique 5 digit number, random 3 digit number
        index++;
        String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueNumber = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueNumber + randomNumber;
    }

    public abstract double setRate();

    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance = balance + accuredInterest;
        System.out.println("Accrued Interest : $" + accuredInterest);
        printBalance();
    }

    //list common methods
    public void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("Deposit amount : $" + amount);
        printBalance();
    }

    public void withDraw(double amount){
        this.balance = balance - amount;
        System.out.println("Withdraw Amount : $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        this.balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now : $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "Name : " + name +
                        "\nAccount number : " + accountNumber +
                        "\nBalance : " + balance
        );
    }


}
