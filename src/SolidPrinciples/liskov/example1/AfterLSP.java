package SolidPrinciples.liskov.example1;
// Flyable interface

// Superclass


import SolidPrinciples.liskov.Bird;

// Subclass that can fly
class FlyingBirdAfterLSP extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying high...");
    }
}

// Subclass that cannot fly
class PenguinAfterLSP extends Bird {
    // Penguins do not implement Flyable
}

public class AfterLSP {
    public static void main(String[] args) {

    }
}
