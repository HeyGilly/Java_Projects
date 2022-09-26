package StudentDB;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private int costOfCourse = 600;

    //-- Constructor: Prompt the user to enter the Students name and current year.
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Enter student first name:");
        this.firstName = sc.nextLine();
        System.out.println("Enter student last name:");
        this.lastName = sc.nextLine();
        System.out.println("""
                Enter student grade level:
                1 - Freshman
                2 - Sophomore
                3 - Junior
                4 - Senior\040
                """);
        this.gradeYear = sc.nextInt();
        // once the user input 1-4, it would be put in the correct grade
        switch (gradeYear) {
            case 1 -> this.gradeYear = 9;
            case 2 -> this.gradeYear = 10;
            case 3 -> this.gradeYear = 11;
            case 4 -> this.gradeYear = 12;
        }


        System.out.println("********************");
        System.out.println();
        System.out.println(firstName +" "+ lastName +" "+ gradeYear+"th grade");

    }


    //-- Generate an ID;

    //-- Enroll in courses

    //-- View Balance

    //-- Pay tuition

    //show status
}
