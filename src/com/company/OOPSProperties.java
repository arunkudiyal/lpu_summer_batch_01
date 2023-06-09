package com.company;

class Student {
    private String name; private int r_no; private int age; private String batch;
    Student(String name, int r_no, int age, String batch) {
        this.name = name;
        this.r_no = r_no;
        this.age = age;
        this.batch = batch;
    }
    // Getters and Setters -> They give you the access to read and write Data Members, NOT DIRECTLY...
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Hey, my name is " + this.name + " and I am " + this.age + ", studying in batch " + this.batch + " with roll number of " + this.r_no);
    }
    public void display(String name) {
        System.out.println("Hello... my name is " + name);
    }
    // public String display() {} --> THIS IS NOT POLYMORPHISM...
    public void display(int age) {
        System.out.println("Hello... my age is " + age);
    }
}

public class OOPSProperties {
    public static void main(String[] args) {
        Student studentOne = new Student("Vivek", 1010122, 21, "PEP_2024");
        // 1. Encapsulation :- A way of binding data members and member functions into a single unit, called Class.
        // 2. Abstraction :- Hiding the implementation details from the user which is no use for the user. So, we prevent this using access modifiers.
        // 3. Polymorphism :- Poly(many) + Morph(Forms) -> A function constructed in many form.
        // Research Work :- CompileTime and RunTime Polymorphism.
        // 4. IMP:- Inheritance :- 1. Abstract Classes            2. Interface
        studentOne.display();
        System.out.println("The name of the Student One is :- " + studentOne.getName());
        studentOne.setName("Vivek Kumar");
        studentOne.display();
        studentOne.display("Siddhant Singh");
        studentOne.display(25);
    }
}
