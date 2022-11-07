package ProgramFlow;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * (12 + 1) + 0);

        System.out.println(randomNumber);

        if (randomNumber >= 1 && randomNumber <= 3)
            System.out.println("You're in Quarter 1");
        else if (randomNumber >=4 && randomNumber <= 6)
            System.out.println("You are in the 2nd Quarter");
        else if (randomNumber >= 7 && randomNumber <= 9)
            System.out.println("You are in the 3rd Quarter");
        else if (randomNumber >= 10 && randomNumber <= 12)
            System.out.println("You are in the 4th Quarter");
        else
            System.out.println("That's an unknown month");

        System.out.println("***********************");

        String[] months = {
                "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"
        };

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for (String month : months) {
            System.out.println(month);
        }





    }
}
