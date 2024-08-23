package com.inheritance.multiLevelInheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance Concepts");
        Son son = new Son();
        System.out.println(son.age+" "+son.bike+" "+son.name);
        son.father();
        son.sonMethod();

    }

}
