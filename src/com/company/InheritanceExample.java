package com.company;

class A {
    int prop1; String prop2;
    public A(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    public void show() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2);
    }
}
// Inheritance -> Way to inherit properties/ methods from one class to another, to increase CODE RE-USABILITY.
// Super Class / Parent Class -> The class which is being inherited (Class - A).
// Sub Class / Child Class -> The class which is inherting the values. (Class - B).
// NOTE :- Any data-member or member function declared public or protected will be accessed in the child class.
class B extends A {
    double prop3; boolean prop4;
    public B(int prop1, String prop2, double prop3, boolean prop4) {
        // You will now call the parent constructor and pass the values of prop1 & prop2 -> super( )
        super(prop1, prop2);
        this.prop3 = prop3;
        this.prop4 = prop4;
    }
    public void display() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2 + " | Property Three -> " + this.prop3 + " | Property Four -> " + this.prop4);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        B childObject = new B(100, "My String", 3.14, true);
        childObject.display();
    }
}
