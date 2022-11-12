import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Monkey");
        animals.add("Fish");
        animals.add("Hamster");

        System.out.println("LinkedList: " + animals);

        System.out.println("********************");

        //-- adding elements to the LinkedList
        animals.add(1,"Horse");
        System.out.println("Updated LinkedList: " + animals);

        System.out.println("********************");

        //--Access LinkedList elements
        String capture = animals.get(1);
        System.out.println("Element at index 1: " + capture);

        System.out.println("********************");

        //-- Change Elements of a LinkedList
        animals.set(3,"Bamboos");
        System.out.println("Updated LinkedList: " + animals);

        System.out.println("********************");

        //-- Remove elements from index 1
        String removeAnimal = animals.remove(1);
        System.out.println("Element that is removed at position 1: " + removeAnimal);
        System.out.println("Updated LinkedList: " + animals);

        System.out.println("********************");

        //-- Check to see if the LinkedList contains an element
        boolean containElement = animals.contains("Monkey");
        System.out.println("Does the LinkedList contain Monkeys? " + containElement);

        System.out.println("********************");

        //-- Shows you the index of the first time Hamster is in the LinkedList
        int indexOfAnimal = animals.indexOf("Hamster");
        System.out.println("Hamster is in the index of " + indexOfAnimal+" in the LinkedList.");

        System.out.println("********************");

        //-- Shows you the last occurrence of the element searched
        System.out.println("LinkedList: " + animals);
        animals.add("Cat");
        System.out.println("Updated LinkedList: " + animals);
        int whereIsCat = animals.lastIndexOf("Cat");
        System.out.println("The Last Cat is at index " +whereIsCat);

        System.out.println("********************");

        // Return the First Element from the LinkedList
        String removeFirstElement = animals.peek();
        System.out.println("Accessed Element: " + removeFirstElement);
        System.out.println(animals);

        System.out.println("********************");

        //--Return and Removes the First element from the LinkedList
        String returnRemoveElement = animals.poll();
        System.out.println("Removed Element: " + returnRemoveElement);
        System.out.println(animals);

        System.out.println("********************");

        //-- Add element at the end
        animals.offer("Squirrel");
        System.out.println("LinkedList after offer(): " + animals);

        System.out.println("********************");

        //-- add element at the beginning
        System.out.println("LinkedList: " + animals);
        animals.addFirst("Beaver");
        System.out.println("Updated LinkedList: "+ animals);

        System.out.println("********************");

        //-- Add element at the end
        System.out.println("LinkedList: " + animals);
        animals.addLast("Unicorn");
        System.out.println("Updated LinkedList: "+ animals);

        System.out.println("********************");

        //-- Remove the first element
        animals.removeFirst();
        System.out.println("Remove first element in LinkedList: "+ animals);

        System.out.println("********************");

        animals.removeLast();
        System.out.println("Removed Last element LinkedList: "+ animals);

        System.out.println("********************");

        //-- Removes all the element of the LinkedList
        animals.clear();
        System.out.println("All has been removed from LinkedList: " + animals);



    }
}
