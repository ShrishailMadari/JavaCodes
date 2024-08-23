package com.constructor;

public class Person {
    int id = 100;
    String name = "Shri";
    double salary = 50000.87;
    Person(int id1, String Name, double salary){
        this.id = id1;
        this.name = Name;
        this.salary = salary;
        System.out.println("Constructor get called");
        System.out.print(id1+" "+Name+" "+salary);
    }

    public static void main(String[] args) {
        System.out.println("constructor cha");
        Person person = new Person(101,"Shridhar",4000);
        System.out.println(person.salary);
        var per = new Person(102,"kjhgfgtr",548564);
    }

}
