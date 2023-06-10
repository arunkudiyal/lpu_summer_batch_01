package com.company;
// Inheritance -> Way to inherit properties/ methods from one class to another, to increase CODE RE-USABILITY.
// Super Class / Parent Class -> The class which is being inherited (Class - A).
// Sub Class / Child Class -> The class which is inherting the values. (Class - B).
// NOTE :- Any data-member or member function declared public or protected will be accessed in the child class.

class A {
    int prop1; String prop2;
    A() { }
    public A(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    public void display() {
        System.out.println("Property One -> " + this.prop1 + " | Property Two -> " + this.prop2);
    }
}
interface B {
    double prop3 = 3.14; boolean prop4 = false;
    public void display();
}
class C extends A implements B {}         // MULTIPLE INHERITANCE -> A case where one child tries to inherit the properties of 2 or more than 2 classes.
// SOLUTIONS FOR MULTIPLE INHERITANCE...

public class InheritanceExample {
    public static void main(String[] args) {
        //        B childObject = new B(3.14, true);
        //        childObject.display();
        C objC = new C();
        objC.display();                 // ???
    }
}
