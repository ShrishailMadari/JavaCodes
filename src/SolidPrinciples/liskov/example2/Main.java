package SolidPrinciples.liskov.example2;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}
// Subclass Dog
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
// Subclass Cat
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Robot extends Animal{
    @Override
    public void makeSound(){
        throw new UnsupportedOperationException("Robots cannot make natural sounds.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myRobot = new Robot(); // This will cause issues

        myDog.makeSound(); // Expected: Bark
        myCat.makeSound(); // Expected: Meow
        myRobot.makeSound(); // This will throw an exception
    }
}
