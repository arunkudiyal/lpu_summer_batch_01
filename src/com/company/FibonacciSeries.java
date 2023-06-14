package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    // Creating a memo for storing the value;
    public static long[] memo;
    public static long fib(int term) {
        // Step 1:- Write Base Conditions
        if(term == 1) return 0;
        if(term == 2) return 1;
        // Step 2:- Look for the values in the memo
        if(memo[term] != 0) return memo[term];      // It has been calculated
        // Step 3:- If the value is not calculated, calculate the values.
        long fibValue = fib(term - 1) + fib(term - 2);
        // Step 4:- The calculated value should be stored in the memo
        memo[term] = fibValue;
        // Step 5:- Return the calculated value
        return fibValue;
    }
    public static long fibonacci(int term) {
        memo = new long[term+2];
        for(int i=0 ; i <= term+1; i++)
            memo[i] = 0;
        return fib(term);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        long value = fibonacci(term);                  // term = 6
        System.out.println(value);
    }

    //    public static int fib(int term) {
    //        // Base Conditions :- Are the given values | known facts in the problem
    //        // Helps you to terminate the code
    //        if(term == 1) return 0;
    //        if(term == 2) return 1;
    //        return fib(term - 1) + fib(term - 2);
    //    }
}
