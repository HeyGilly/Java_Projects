import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //-- Creating an instance of Password Validator
        PasswordValidator userPassword = new PasswordValidator();
        //-- Password Rules
        PasswordValidator.printPasswordRules();
        //-- if valid true or false
        boolean valid;

        do {
            //-- ask the user for their password.
            System.out.println("Enter your new password:");
            //-- capturing the users input password
            var proposedPassword = scanner.nextLine();
            valid = PasswordValidator.changePassword(proposedPassword);
        }while(!valid);

        //-- Will run once the password is valid.
        System.out.println("The proposed password is valid!");
        //-- Closing the scanner
        scanner.close();


    }

}
