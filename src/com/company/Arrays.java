package com.company;

import java.util.ArrayList;
import java.util.Scanner;

// 1. Array is a linear DS, it stores multiple values in one single variable.
// 2. Array uses indexing for accessing the value, indexing starts from 0.
// 3. Array stores multiple values in contiguous manner.
// 4. Array only and only contains values of the same data type.

// Scanner --> 2 delimiters -> enter, space
public class Arrays {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i < n; i++) {
            for(int j=i+1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    output.add(i); output.add(j);
                    break;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // Creating user driven array, the size and the value will be coming from the user.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();                // 5
        // create an array :-
        int[] array = new int[size];            // index -> 0, 1, 2, 3, 4
        for( int i=0; i < size; i++ )              // i = 0, 1, 2, 3, 4
            array[i] = sc.nextInt();

        // Size Variations
        // char -> 1 byte, byte -> 2 bytes, short -> 2 bytes, int -> 4 bytes, float -> 4 bytes, double -> 8 bytes,
        // long -> 8 bytes, boolean -> 1 byte

        // Displaying the values
        System.out.println(array);              // Reference Variable -> Address of the Ist elt in the array | [I@54bedef2
        // array : 100 200 300 400 500
        //       : #10 #14 #18 #22 #26

        for(int i=0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println(array.length);


        ArrayList<Integer> al2 = new ArrayList<>();
        int[] arr = {2,7,11,15};
        al2 = twoSum(arr, 9 );
        System.out.println(al2);

        // 2D Arrays

    }
}
