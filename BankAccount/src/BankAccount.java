import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccount {

    //-- Creation of Instance Variables
    double balance;
    double previousTransaction;
    String Username;
    String userAccountNumber;

    //-- Create a constructor that will make it accessible for the username and Pin.
    public BankAccount(String Username, String userAccountNumber) {
        this.Username = Username;
        this.userAccountNumber = userAccountNumber;
    }

    //-- Main Menu for application
    void menu(){
        // going to need user's input
        Scanner usersMenuChoice = new Scanner(System.in);
        // Money Format
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
        //-- Capture the Input
        char usersInput;
        //-- Capitalize Customer username
        String CapitalizeName = Username.substring(0, 1).toUpperCase() + Username.substring(1);

        //--- Introduction of the application
        //      The user will have a choice of what they want to do based on what letter they enter.
        //      Check balance, previous balance, withdraw, deposit or exit
        do {
            System.out.println("********************************************");
            System.out.println("What would you like help with today "+CapitalizeName+"?");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Exit");
            System.out.println("********************************************");
            System.out.println("Choose an option");

            //-- takes in the users input and if they add a whole word
            //   we are only going to capture the user's character
            usersInput = usersMenuChoice.next().charAt(0);
            System.out.println();

            if (usersInput == 'a' || usersInput == 'A') {
                //-- Showcase of Balance
                System.out.println("......................");
                System.out.println("Balance: " + moneyFormat.format(balance));
                System.out.println("......................");
                System.out.println("\n");
            } else if (usersInput == 'b' || usersInput == 'B'){
                //-- Enter your deposit
                System.out.println("......................");
                System.out.println("Enter a amount to deposit :");
                System.out.println("......................");
                // user's input
                double depositAmount = usersMenuChoice.nextDouble();
                // Calling the method for depositing the money and will update the previous transaction and balance.
                deposit(depositAmount);
                System.out.println("\n");
            } else if (usersInput == 'c' || usersInput == 'C'){
                //-- Withdraw from Account
                System.out.println("......................");
                System.out.println("Enter a amount to withdraw:");
                System.out.println("......................");
                // Capture the amount withdraw
                double withdrawAmount = usersMenuChoice.nextDouble();
                // Calling the method for WITHDRAWING the money and will update the previous transaction and balance.
                withdraw(withdrawAmount);
                System.out.println("\n");
            } else if (usersInput == 'd' || usersInput == 'D') {
                System.out.println("......................");
                System.out.println("Previous Transaction:");
                getPreviousTransaction();
                System.out.println("......................");
                System.out.println("\n");
            }
        }while (!(usersInput == 'e' || usersInput == 'E'));

        //-- Once the application is finished you will be thanked
        System.out.println("********************************************");
        System.out.println("Thank you "+CapitalizeName+" for using our banking services");

    }


    //--- Deposit method
    void deposit(double amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    //--- Withdraw Methods
    void withdraw(double amt){
        if(amt != 0 && balance >= amt){
            balance -= amt;
            previousTransaction =- amt;
        }
        else if(balance < amt){
            System.out.println("Bank balance insufficient");
        }
    }

    //--- Previous Transaction
    void getPreviousTransaction(){
        // Money Format
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");

        if(previousTransaction > 0){
            System.out.println("Deposited: "+ moneyFormat.format(previousTransaction));
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: "+ moneyFormat.format(Math.abs(previousTransaction)));
        }
        else{
            System.out.println("No transaction occurred");
        }
    }
}