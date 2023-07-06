package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] numbers) {
        int n = numbers.length;
        int[] output = new int[n];
        Arrays.fill(output, 1);
        // solution for n-1 results, as memo[0] is already described.
        for(int i=1; i < n; i++) {
            for(int j=i-1; j >= 0; j--) {
                if( numbers[j] >= numbers[i] ) continue;
                int possibleAns = output[j] + 1;
                if(possibleAns > output[i]) output[i] = possibleAns;
            }
        }
        int best = 0;
        for(int i=0; i < n; i++) {
            if(output[i] > best) best = output[i];
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i < n; i++)
            numbers[i] = sc.nextInt();
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int result = lis.lengthOfLIS(numbers);
        System.out.println(result);
    }
}
