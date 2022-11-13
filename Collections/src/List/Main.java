package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <list> void main(String[] args) {

        List fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("grape");

        System.out.println(fruits);

        System.out.println(fruits.get(2));

        System.out.println("*********************");

        for(Object i : fruits){
            System.out.println(i);
        }
        System.out.println("*********************");

        fruits.set(1,"banana");

        for(Object i : fruits){
            System.out.println(i);
        }

        System.out.println("*********************");
        fruits.add("lemon");
        System.out.println(fruits);

        System.out.println("*********************");

        System.out.println(fruits.indexOf("pear"));
        System.out.println(fruits.indexOf("lemon"));

        System.out.println();
        System.out.println("*********************");

        List moreFruit = List.of("cheery","cranberry", "lemon");

        System.out.println(fruits.contains(moreFruit));




    }
}
