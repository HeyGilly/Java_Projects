package HandlingAndDebugging;

public class Main {

    public static void main(String[] args) {

        System.out.println("********************");

        String welcome = "Welcome";
        System.out.println(welcome);
        System.out.println("********************");
        char[] chars = welcome.toCharArray();

        //get one character at a time
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println("********************");

        // Try and Catch
        try {
            // Get the last character
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);

            if(chars.length < 10){
                throw (new Exception("My custom message"));
            }

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index problem");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("string Index Problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
