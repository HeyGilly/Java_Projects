package EmailApp;

//----- Scenario: I play an IT Supper Administrator, and I am in charge with the task of creating email account for new hires.
//--- [X]   Generate an email with the following syntax: firstname.lastname@department.company.com
//--- [X] Determine the departments (Sales, development, accounting), if non leave blank
//--- [X] Have set methods to change the password, set the mailbox capacity, and define an alternate email address
//--- [ ] Have get methods to display the name and mailbox capacity

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-- Build an introduction that will ask the user to input first name and last name.
        System.out.println();
        System.out.println("****************************");
        System.out.println("Welcome to High School High!");
        System.out.println("New hires will have to provide first name, last name and what department you will are assigned to.");
        System.out.println("First Name:");
        String firstName = sc.nextLine();
        System.out.println("Last Name:");
        String lastName = sc.nextLine();

        Email userEmail = new Email(firstName,lastName);

        System.out.println(userEmail.showInfo());
    }
}
