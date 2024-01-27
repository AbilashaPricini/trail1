package backaccountapplication;

public class Savings extends Account{
    //list properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    //constructor to initialize savings account properties
    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        this.accountNumber = "1" + accountNumber;
        /*System.out.println("Savings account number : " + this.accountNumber);
        System.out.println("New savings account");*/
        setSafetyDepositBox();
    }
    @Override
    public double setRate() {
        rate = getBaseRate() - .25;
        return rate;
    }
    //list any methods specific to the savings account
    private void setSafetyDepositBox(){
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3)); //3 digits
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4)); //4 digits
    }
    public void showInfo(){
        System.out.println("Account type : Savings account");
        super.showInfo();
        System.out.println(
                "Your savings Account features" +
                "\n Safety Deposit Box Id : " + safetyDepositBoxID +
                "\n Safety Deposit Box key : " + safetyDepositBoxKey +
                "\n Rate : " + rate + "%"
        );
    }
}
