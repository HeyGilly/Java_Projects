package WorkingWithObjects;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //--- Connecting an array together
        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String connectWord = new String(chars);
        System.out.println(connectWord);

        //---Outputting one character per line
        char[] chars1 = connectWord.toCharArray();
        for (char x : chars1) {
            System.out.println(x);
        }

        System.out.println("********************");

        //Convert primitive into string.
        int intValue = 42;
        String fromINT = Integer.toString(intValue);
        System.out.println(fromINT);

        boolean booValue = true;
        String fromBoolean = Boolean.toString(booValue);
        System.out.println(fromBoolean);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        System.out.println("********************");
        // Building a string from multiple values

        String str1 = "Hello";
        String str2 = "World";
        String connected = str1 +' '+str2;
        System.out.println(connected);

        StringBuilder sb = new StringBuilder("Hello")
        .append(", ")
        .append("World")
        .append("!");
        System.out.println(sb);

        System.out.println("********************");
        String word1 = "Hello";
        String word2 = "Hello";

        if(word1 == word2)
            System.out.println("They Match!");
        else
            System.out.println("They Don't Match");

        String word3 = "hello";
        String word4  = "Hello ";
        String word5 = "World";
        String word6 = word4 + word5;
        String word7 ="Hello World";
        String word8 ="hello world";

        if(word6 == word7)
            System.out.println("They Match!");
        else
            System.out.println("They Don't Match");

        if(word6.equals(word7))
            System.out.println("They Match!");
        else
            System.out.println("They Don't Match");

        if(word6.equalsIgnoreCase(word8))
            System.out.println("They Match!");
        else
            System.out.println("They Don't Match");

        System.out.println("********************");

        Locale locale = new Locale("en", "US");

        double doubelValue = 1_234_456_789.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: "+numF.format(doubelValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + curF.format(doubelValue));

        NumberFormat intF  = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubelValue));

        System.out.println("********************");

        String s1 = "Welcome to Texas";
        System.out.println("Length of String: " + s1.length());

        int position = s1.indexOf("Texas");
        System.out.println("Position of substring: " + position);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome        ";
        int len1 = s2.length();
        System.out.println(len1);

        String s3 = s2.trim();
        System.out.println(s3.length());

        System.out.println("********************");

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2022, 01, 20);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();

        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        // Java 8
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ldate = LocalDate.of(2020, 04, 20);
        System.out.println(ldate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ldate));

    }
}
