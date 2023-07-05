package com.company;

import java.util.Scanner;

public class KnapsackProblem {
    public int findMax(int a, int b) {
        return Math.max(a, b);
    }
    public int sackUtil(int W, int[] weight, int[] price, int n, int[][] table) {
        if(n == 0 || W == 0) return 0;
        else if(table[n][W] != -1) return table[n][W];
        else if(weight[n-1] > W) return sackUtil(W, weight, price, n-1, table);
        else return table[n][W] = findMax(sackUtil(W, weight, price, n-1, table), price[n-1] + sackUtil(W-weight[n-1], weight, price, n-1, table));
    }
    public int sack(int W, int[] weight, int[] price, int n) {
        int[][] table = new int[n+1][W+1];
        for(int i=0; i <= n; i++) {
            for(int j=0; j <= W; j++) {
                table[i][j] = -1;
            }
        }
        return sackUtil(W, weight, price, n, table);
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
        System.out.println(kSack.sack(W, weight, profit, n));
    }
}
