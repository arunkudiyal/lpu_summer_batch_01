package com.company;

import java.util.Scanner;

public class KnapsackProblem {
    public int knapSackUtil(int W, int[] weight, int[] price, int n, int[][] table) {
        if(n == 0 || W == 0) return 0;
        if(table[n][W] != -1) return table[n][W];
        if(weight[n-1] > W) return table[n][W] = knapSackUtil(W, weight, price, n-1, table);
        else return
    }
    public int knapSack(int W, int[] weight, int[] profit, int n) {
        int[][] table = new int[n+1][W+1];
        for(int i=0; i <= n; i++) {
            for(int j=0; j <= W; j++) {
                // -1 represents that the value is not found.
                table[i][j] = -1;
            }
        }
        return knapSackUtil(W, weight, profit, n, table);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] profit = new int[n];
        int[] weight = new int[n];
        // Input :-
        // 1 2
        // 2 3
        // 5 4
        // 6 5
        for(int i=0; i < n; i++) {
            profit[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        KnapsackProblem kSack = new KnapsackProblem();
        System.out.println(kSack.knapSack(W, weight, profit, n));;
    }
}
