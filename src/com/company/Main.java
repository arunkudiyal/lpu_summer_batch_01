package com.company;

// IMP :- There exist a default package which automatically gets imported in any Java file --> java.lang
import java.util.Scanner;

// Packages --> Folder --> Only contains collection of java classes
class Main {
    public static void main(String[] args) {
        // 1. How to display messages
        System.out.println("Hello World...");
        System.out.print("Hello...");
        System.out.print("World...");

        // byte (-128 - +127); short (-32766 - +32767), int, char, boolean, float, double, long.

        // 2. Take user's custom input --> Separate Class --> Scanner ( cin >> & scanf() )
        // 2. a.) Create an object of Scanner

        // Research Work -->
        // 1. How to take the input as a char and as a String.
        // char -> one single char -> 'a', 'b', 'c'
        // String -> combination of characters -> "hello"

        // 2. ASCII values
        char ch1 = 'a';
        char ch2 = 97;

        Scanner sc = new Scanner(System.in);
        // 1. byte
        // byte var1 = -128;
        byte var1 = sc.nextByte();
        short var2 = sc.nextShort();
        int var3 = sc.nextInt();
    }
}