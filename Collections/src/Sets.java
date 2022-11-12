import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

public class Sets {
    public static void main1(String[] args) {

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

        System.out.println();

        Iterator<String> iterator = moreFruit.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println("****************************");
        for (Object name : moreFruit){
            System.out.println(name);
        }
        System.out.println("****************************");
        moreFruit.forEach(System.out::println);

        System.out.println();

        List<Integer> listNum = Arrays.asList(3,9,1,4,7,2,5,3,8,9,1,3,8,6);
        System.out.println(listNum);

        //-- This will take out the duplicates
        Set<Integer> uniqueNum = new HashSet<>(listNum);
        System.out.println(uniqueNum);

        //-- collects only the odd numbers
        Set<Integer> uniqueOddNumber = listNum.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet());
        System.out.println(uniqueOddNumber);

        System.out.println("****************************");

        Set<Integer> Original = new HashSet<>(Arrays.asList(20,56, 89, 31, 8, 5));
        Set<Integer> twoCopy = new HashSet<>(Arrays.asList(8, 89));
        Set<Integer> oneCopy = new HashSet<>(Arrays.asList(2, 20));
        Set<Integer> noCopy = new HashSet<>(Arrays.asList(1, 10));

        if (Original.containsAll(twoCopy))
            System.out.println("twocopy is a match to original, contains All");

        if(Original.contains(twoCopy))
            System.out.println("twocopy is a match to original, contains");
        else
            System.out.println("twocopy is NOT a match to original, contains");


        if(Original.containsAll(oneCopy))
            System.out.println("onecopy is a match to original, contains All");
        else
            System.out.println("onecopy is NOT a match to original, contains all");


        if(Original.contains(oneCopy))
            System.out.println("oneCopy is a match to original, contains");
        else
            System.out.println("oneCopy is NOT a match to original, contains");

        if(Original.containsAll(noCopy))
            System.out.println("noCopy is a match to original, contains ALL");
        else
            System.out.println("noCopy is NOT a match to original, contains ALL");

        if(Original.contains(noCopy))
            System.out.println("noCopy is a match to original, contains");
        else
            System.out.println("noCopy is NOT a match to original, contains");


        System.out.println("****************************");

        Set<Integer> D1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Set<Integer> D2 = new HashSet<>(Arrays.asList(2,4,6,8));

        System.out.println("Before intersection: "+ D1);
        D1.retainAll(D2);
        System.out.println("After intersection: "+ D1);

        System.out.println("****************************");

        ArrayList <String> animal = new ArrayList<>();
        animal.add("Crocodile");

        System.out.println("Animal list: " + animal);

        ArrayList<String> mammal = new ArrayList<>();
        mammal.add("Elephant");
        mammal.add("Dog");

        System.out.println("Mammel list: " + mammal);

        animal.addAll(mammal);

        System.out.println("New animal list: " + animal);

        System.out.println(animal.get(2));

        for (String i : animal){
            System.out.println(i);
        }

        animal.set(1,"monkey");

        System.out.println("New animal set: " + animal);

        animal.add("Bumble Bee");
        animal.add("Camel");
        animal.add("Hippo");
        animal.add("Kangaroo");

        System.out.println("New list of animal: " +animal);

        String[] newArrayAnimal = new String[animal.size()];

        animal.toArray(newArrayAnimal);

        System.out.println("Array: ");
        for (String i : newArrayAnimal){
            System.out.print(i + " ");
        }

        ArrayList<String> backToArrayList = new ArrayList<>(Arrays.asList(newArrayAnimal));

        System.out.println("ArrayList: "+ backToArrayList);


    }
}
