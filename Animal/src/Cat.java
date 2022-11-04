public class Cat extends Animal{
    //Cat inherits from animal and overrides the makeSound() method.
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }

    // ALso Contains a Scratch method
    public void scratch(){
        System.out.println("I am a cat. I scratch  things.");
    }

}
