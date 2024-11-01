package SolidPrinciples.liskov.example1;
// Superclass
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

// Subclass that can fly
class FlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Flying high...");
    }
}

// Subclass that cannot fly
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly.");
    }
}

public class Before {
    public static void main(String[] args) {
        // Create instances of FlyingBird and Penguin
        Bird sparrow = new FlyingBird();
        Bird penguin = new Penguin();

        // Call the fly method on FlyingBird instance
        System.out.println("Sparrow:");
        sparrow.fly();  // Expected output: "Flying high..."

        // Call the fly method on Penguin instance with exception handling
        System.out.println("Penguin:");
        try {
            penguin.fly();  // Expected to throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());  // Output: "Penguins cannot fly."
        }
    }
}
