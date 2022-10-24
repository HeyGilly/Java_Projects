package gross_calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ask the user the number of hours worked per week
        System.out.println("What is your number of hours work per week?");
        int usersNumHours = sc.nextInt();
        // Get the hourly pay rate
        System.out.println("What is your pay rate per hour?");
        double usersPayRate = sc.nextInt();
        // Do Formula for Multiplying the hourly rate and hours worked
        double totalGrossPayRate = usersNumHours * usersPayRate;
        //Display the result
        System.out.println("$"+totalGrossPayRate);
    }
}
