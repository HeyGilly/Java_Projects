package StudentDB;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int userInput;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private String tuitionBalance;
    private static final int costOfCourse = 600;
    private static int id = 5000;

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
        this.userInput = sc.nextInt();
        // once the user input 1-4, it would be put in the correct grade
        switch (userInput) {
            case 1 -> this.gradeYear = 9;
            case 2 -> this.gradeYear = 10;
            case 3 -> this.gradeYear = 11;
            case 4 -> this.gradeYear = 12;
        }

        // Set the student ID
        setStudentID();

        System.out.println("********************");
        System.out.println();
        System.out.println(firstName +" "+ lastName +" "+ gradeYear+"th grade with an ID of "+studentID);

    }


    //-- Generate an ID;
        private void setStudentID(){
            id++;
            // GradeLevel + ID
            this.studentID = userInput + "" + id;
        }

    //-- Enroll in courses
    public void enroll(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter course to enroll (Q to quit):");
            String course = sc.nextLine();
            if (!Objects.equals(course, "Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{
                break;
            }
        }while (true);

        System.out.println("Enrolled in: "+courses);
        System.out.println("Tuition Balance: "+tuitionBalance);


    }

    //-- View Balance

    //-- Pay tuition

    //show status
}
