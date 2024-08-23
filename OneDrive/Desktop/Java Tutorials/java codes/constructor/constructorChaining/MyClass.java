package constructor.constructorChaining;

class ParentClass {
    int value = 10;
}

class ChildClass extends ParentClass {
    int value = 20;

    public void displayValues() {
        System.out.println(super.value); // Accesses the 'value' from the superclass
        System.out.println(this.value); // Accesses the 'value' from the current class
    }
}
