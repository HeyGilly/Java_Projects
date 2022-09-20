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


        }while (!(usersInput == 'e' || usersInput == 'E'));

        //-- Once the application is finished you will be thanked
        System.out.println("********************************************");
        System.out.println("Thank you "+CapitalizeName+" for using our banking services");

    }



}
