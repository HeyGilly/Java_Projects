public class Dog extends Animal{

    // Dog inherits from animal and overrides makeSound() to print a sound that specific sound to a dog.
    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
    //An addition is the fetch method
    public void fetch(){
        System.out.println("Fetching the ball is fun!");
    }




}
