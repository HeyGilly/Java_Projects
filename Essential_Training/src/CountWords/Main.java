package CountWords;

public class Main {
    public static void main(String[] args) {
        countWords("I love Java");
        System.out.println();
        reverseString("Wow this is cool!");
    }

    // This method is going to cound the words you have and will print out each word on its own line.
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numOfWords = words.length;
        String message = String.format("Your text contains %d words", numOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    //This method is going to return your string in reverse
     public static void reverseString(String text){
        for(int i = text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
     }

}
