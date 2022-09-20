import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-- Gather User's input
        Scanner input = new Scanner(System.in);
        //-- Start of application
        System.out.println("***********************");
        //-- Asking the user for their Username & 4 digit pin
        System.out.println("Enter your Username:");
        String username = input.nextLine();
        System.out.println("Enter your Account Number:");
        String accountNumber = input.nextLine();

        //-- Once approved, Run the Bank Application

        BankAccount AccountUser = new BankAccount(username, accountNumber);
        // System.out.println(AccountUser.customerUsername);
        // System.out.println(AccountUser.customerPinCode);

        //-- Run the AccountUser menu method. this will run the whole program that
        //   will take in the username and pinNumber
        AccountUser.menu();


    }
}
