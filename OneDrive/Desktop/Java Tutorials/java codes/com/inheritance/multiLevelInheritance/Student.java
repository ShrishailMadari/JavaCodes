package com.inheritance.multiLevelInheritance;

public class Student {
    public static void main(String[] args) {
        System.out.println("the flow");
        Department department = new Department();
        System.out.println("Department Name is: "+department.deptName);
        department.conductFest();
        System.out.println("Collage name is: "+department.collageName);
        department.providePlacements();
        System.out.println("university name is : "+department.universityName);
        department.conductExam();

    }

}
