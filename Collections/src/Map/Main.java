package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map fruitCalories = new HashMap();

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17); // Overrides existing value

        fruitCalories.putIfAbsent("pear", 120);
        fruitCalories.putIfAbsent("apple", 120);

        System.out.println(fruitCalories);

        System.out.println(fruitCalories.size());

        System.out.println(fruitCalories.keySet());
        System.out.println(fruitCalories.values());
    }
}
