package com.company;

// OOP -> Deal with classes and objects.
// Class :- A template, which helps you create real-life entities. -> 1. Data Members (PROPERTIES) 2. Member Functions (METHODS)
// Object :- The real-life entities created from the class is called an object.

class Animal {
    // Class :- A block which contains properties, methods & constructors.

    // 1. Data Members :- The primitive / non-primitive data used for building the objects.
    String name; int no_of_legs; boolean isCarnivorous; boolean canPet; String color;
    // Member Functions :- Functions or Methods which help you create a default function available for all the object created from the objects.
    public void display() {
        System.out.println("Hey, my name is " + name + ". My color is " + color + ". I have " + no_of_legs + " legs.");
    }

    // Constructors :- Used to initialise the values of the properties when you are creating the object.
    // 2 types :- 1. Default / Non-Parametrised (automatically created by the compiler)     2. Parametrised Constructor
    // NOTE:- If you are using a parametrised constructor only, then you cannot use default constructor; until you define it.
    Animal(int no_of_legs, boolean isCarnivorous, boolean canPet, String color, String name) {
        // this.propertyName = parameterName
        this.name = name;
        this.no_of_legs = no_of_legs;
        this.color = color;
        this.canPet = canPet;
        this.isCarnivorous = isCarnivorous;
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Object :- Real-Life Entity
        // Syntax :- ClassName objectName = new Constructor();
        // Constructor has the same name as that of the class
        Animal dog = new Animal(4, true, true, "Black", "Jack");
        // dog.name = "..."
        dog.display();                          // Default Values - int - 0, String - null, float/double - 0.0, boolean - false, ...
        dog.display();
    }
}
