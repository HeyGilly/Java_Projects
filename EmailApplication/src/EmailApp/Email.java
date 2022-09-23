package EmailApp;

import java.util.Scanner;

public class Email {
    Scanner in = new Scanner(System.in);

    //-- Properties
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 8;
    private String alternateEmail;

    //-- Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment(in);
        System.out.println("Department: " + this.department);

        //-- Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        // showcase the password for user
        System.out.println("Your password is: "+ this.password);

    }

    //-- Ask for department
        private String setDepartment(Scanner in){
            System.out.println();
            System.out.println("****************************");
            System.out.println("DEPARTMENT CODE");
            System.out.println(" 1) for Sales\n 2) for Development\n 3) for Accounting\n 0) for none");
            System.out.println("Enter the department code:");
            int depChoice = in.nextInt();
            String userDepartment = "";
            //-- Switch Conditional
            if(depChoice == 1){
                userDepartment = "Sales";
            }else if (depChoice == 2){
                userDepartment = "Development";
            }else if (depChoice == 3){
                userDepartment = "Accounting";
            } else if (depChoice == 0){
                userDepartment = "";
            }else{
                System.out.println();
                System.out.println("Please insert the proper department!!!");
                setDepartment(in);
            }
            return userDepartment;
        }


    //-- Generate Random Password
    private String randomPassword(int length){
        // this is the characters that you are allowed to use
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        // generate a random number and pass it as an array
        char[] password = new char[length];
        for (int i =0;i < length; i++){
            //-- this is going to give a random number between the length inputted.
            int randomNum = (int) (Math.random() * passwordSet.length());
            //--
            password[i] = passwordSet.charAt(randomNum);
        }
        return  new String(password);
    }

    //--- Set the mailbox capacity

    //-- set the alternate email

    //-- Change the password
}
