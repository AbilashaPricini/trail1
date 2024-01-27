package backaccountapplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();
        /*Checking checkingAccount = new Checking("Abilasha Pricini", "987654321", 1500);
        Savings savingsAccount = new Savings("Subramani G", "765382910", 2500);

        savingsAccount.compound();

        checkingAccount.showInfo();
        System.out.println("====================================================");
        savingsAccount.showInfo();

        *//*savingsAccount.deposit(5000);
        savingsAccount.withDraw(200);
        savingsAccount.transfer("IOB", 1000);*//*

        savingsAccount.compound();*/

        //read a CSV file then create new accounts based on that data

        String file = "C:\\Users\\abikr\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for(String[] accountHolders : newAccountHolders){
            //System.out.println("New Account: ");
            String name = accountHolders[0];
            String SSN = accountHolders[1];
            String accountType = accountHolders[2];
            double initDeposit = Double.parseDouble(accountHolders[3]);
            //System.out.println(name + " : " + SSN + " : " + accountType + " : $" + initDeposit);
            /*System.out.println(accountHolders[0]);
            System.out.println(accountHolders[1]);
            System.out.println(accountHolders[2]);
            System.out.println(accountHolders[3]);*/

            if(accountType.equals("Savings")){
                //System.out.println("Open a savings account");
                accounts.add(new Savings(name, SSN, initDeposit));
            }else if(accountType.equals("Checking")){
                //System.out.println("Open a checking account");
                accounts.add(new Checking(name, SSN, initDeposit));
            }else{
                System.out.println("Error reading Account type");
            }
        }

        //accounts.get(5).showInfo();

        for(Account acc : accounts){
            System.out.println("\n******************************");
            acc.showInfo();
        }
    }


}
