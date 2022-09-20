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
}
