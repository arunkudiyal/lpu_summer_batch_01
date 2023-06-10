package com.company;

import java.util.Scanner;
// 0,  1,  2,  3,  4
// 10, 20, 30, 40, 50 | 100
public class LinearSearch {
    public static void liner_search(int n, int[] arr, int elt) {
        // traverse the entire array
        for(int i=0; i < n; i++) {
            // i check and compare each element with the elt user is looking for
            if(arr[i] == elt) {
                // print all the occurances of the desired in/p
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int standard_liner_search(int n, int[] arr, int elt) {
        // traverse the entire array
        for(int i=0; i < n; i++) {
            // i check and compare each element with the elt user is looking for
            if(arr[i] == elt)
                // print all the occurances of the desired in/p
                return i;
        }
        // If I iterated the entire array but still did not find the element
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   // size of the array
        int[] arr = new int[n];                 // build the array
        for(int i=0; i < n; i++)                // input for the array
            arr[i] = sc.nextInt();
        int elt = sc.nextInt();                 // the input user wants to search
        liner_search(n, arr, elt);
        int index = standard_liner_search(n, arr, elt);
        System.out.println(index);
    }
}
