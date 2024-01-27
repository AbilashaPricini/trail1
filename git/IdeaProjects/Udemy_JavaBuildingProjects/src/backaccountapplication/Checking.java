package backaccountapplication;

public class Checking extends Account{
    //list properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;
    //constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        this.accountNumber = "2" + accountNumber;
        /*System.out.println("Checking account number : " + this.accountNumber);
        System.out.println("New checking account");*/
        setDebitCard();
    }

    @Override
    public double setRate() {
        rate = getBaseRate() * .15;
        return rate;
    }

    //list any methods specific to the checking account
    private void setDebitCard(){
        this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12)); //12 digit
        this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    public void showInfo(){
        System.out.println("Account type : Checking account");
        super.showInfo();
        System.out.println(
                "Your current account features" +
                "\n Debit card number : " + debitCardNumber +
                "\n Debit card pin : " + debitCardPin +
                "\n Rate : " + rate + "%"
        );
    }

}
