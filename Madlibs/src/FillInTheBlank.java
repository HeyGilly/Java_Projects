import java.sql.SQLOutput;
import java.util.Scanner;

public class FillInTheBlank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Welcome to Madlibs 2.0");
        System.out.println();
        System.out.println("Let's create a story!");
        System.out.println();
        System.out.println("Enter an adjective:");
        String adjective_01 = sc.next();
        System.out.println("Enter an adjective:");
        String adjective_02 = sc.next();
        System.out.println("Enter a Noun:");
        String noun_01 = sc.next();
        System.out.println("Enter a Noun:");
        String noun_02 = sc.next();
        System.out.println("Enter a Plural Noun:");
        String pluralNoun_01 = sc.next();
        System.out.println("Enter a name of a game:");
        String nameOfGame_01 = sc.next();
        System.out.println("Enter a Plural Noun:");
        String pluralNoun_02 = sc.next();
        System.out.println("Enter a verb ending in 'ING':");
        String verbEndingInING_01 = sc.next();
        System.out.println("Enter a verb ending in 'ING':");
        String verbEndingInING_02 = sc.next();
        System.out.println("Enter a Plural Noun:");
        String pluralNoun_03= sc.next();
        System.out.println("Enter a verb ending in 'ING':");
        String verbEndingInING_03 = sc.next();

        sc.close();

        System.out.println("******************************");
        System.out.println();

        System.out.println("" +
                "A vacation is when you take a trip to some "+adjective_01+" place" + " with your "+adjective_02+" family. " +
                "Usually you go to some place that is near a/an"+noun_01+" or up on a/an "+noun_02+" A good vacation place is one where you can ride "+
                pluralNoun_01 +" or play "+nameOfGame_01+" or go hunting for "+pluralNoun_02+". I like to spend my time "+verbEndingInING_01+" or "+
                verbEndingInING_02+ ". When parents go on a vacation, they spend their time eating three" + pluralNoun_03+" a day, and fathers play golf, and mothers"+
                " sit around "+verbEndingInING_03+"."
        );
    }
}
