import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Have lemon? " + fruits.contains("lemon"));
        System.out.println("Have lemon? " + fruits.contains("apple"));

        int size = fruits.size();
        System.out.println("with lemon there is "+size+" elements");

        fruits.remove("lemon");
        size = fruits.size();
        System.out.println("with lemon there is "+size+" elements");

    Set moreFruit = Set.of("pear", "cherry", "raisin");
        System.out.println(moreFruit);

        moreFruit.add("cranberry");
        moreFruit.remove("pear");
        System.out.println(moreFruit);



    }
}
