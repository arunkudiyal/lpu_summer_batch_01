package com.company;

// Interface :-
interface Employee {
    // Data Members :- Are always going to be static.
    int emp_id = 1002345; String name = "Employee One"; String dept = "IT"; String bGroup = "A+";

    // Constructors :- Creating constructor in Interfaces is NOT allowed because the data is already initialised.
    // Employee() { }

    // Member Functions :- You can have member functions in Interface, BUT THEY SHOULD NOT CONTAIN BODY.
    public void display();
}

//interface RBI {
//    int roi = 5;
//    public int display(int roi);
//}

public class InterfaceExample {
    public static void main(String[] args) {

    }
}
