public class PasswordValidator {

    //-- The current username of the user
    private static String currentUsername = "johnDoe";
    //-- The current password of the user
    private static String currentPassword = "ABC_def_123";


    public static void printPasswordRules(){
        System.out.println();
        System.out.println("***********************");
        System.out.println(" Your new password must meet the following requirements:");
        System.out.println("   * at least 8 characters long");
        System.out.println("   * contain an uppercase letter");
        System.out.println("   * contain a special character");
        System.out.println("   * not contain the username");
        System.out.println("   * not the same as the old password");
        System.out.println("***********************");
        System.out.println();
    }


    public static boolean changePassword(String newPassword){
        // going to start as true validation, meaning the password is valid.
        boolean valid = true;
        //-- variable for the error message.
        String errorMessage = "";

        //-- This method checks to see if the length of the password is 8 characters
        if(newPassword.length()<8){
            valid = false;
            errorMessage = "\n Your password must be at least 8 characters.";
        }

        //-- Checks to see if their is any uppercase, if not error message will announce.
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage = "\n Your password must a uppercase character.";
        }

        //-- Check to see if the password contains a special character
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage = "\n Your password must include a special character (e.g. %,$[:).";
        }

        //-- Check to see if the new password is different from the old password
        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage = "\n Your password must be different from your current password.";
        }

        //-- Check to see if the new Password is different from the old password.
        if(newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage = "\n Your password cannot contain your username.";
        }

        if (!valid)
            System.out.println(errorMessage);

        return valid;
    }


}
