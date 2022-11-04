public class Main {
    public static void main(String[] args) {

        //Create a normal dof object and name him rocky
        // typical inheritance
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        // polymorphism
        // Sasha is a type of animal but an instance of a Dog
        Animal sasha = new Dog();
        // it's an instance of the DOg
        sasha.makeSound();

        // going to change Sasha into a Cat
        //--- POLYMORPHISM
        //      Since Sasha is a type of defined Animal and the dog/cat class are both inherited by Animal
        //      Sasha can morph into any one of these.
        sasha = new Cat();
        sasha.makeSound();
    // in order to get the scratch method , we only have access to the Animal type only having access to the animal methods.
        // we are going to down cast sahsa to Cat.
        // in this specific call it will make sasha into a cat type so we can execute the scratch method
        ((Cat)sasha).scratch();

    }
}