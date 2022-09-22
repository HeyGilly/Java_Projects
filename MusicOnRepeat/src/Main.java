import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-- The song will start on repeat (true)
        boolean isOnRepeat = true;

        //-- while loop will run will the user has it on Repeat
        while (isOnRepeat){
            //-- The song is playing
            System.out.println("PLaying Current Song la la la la ");
            //-- Ask the user if they would like to proceed in repeat
            System.out.println("Would you like to take this song off of repeat? if so, answer yes");
            //-- Capture user input
            String userInput = sc.next();
            // if statement if it's true
            if (userInput.equalsIgnoreCase("yes"))
                isOnRepeat = false;
        }
        System.out.println("Playing next song");

        sc.close();

    }
}
